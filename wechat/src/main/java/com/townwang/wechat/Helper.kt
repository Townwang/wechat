package com.townwang.wechat
import android.annotation.SuppressLint
import android.content.Context
import androidx.annotation.DrawableRes
import com.townwang.wechat.common.*
import java.io.Serializable
/**
 * weChat to scan
 */
fun Context.openWeChatScan() {
    go(goWeChatLauncherUI(), getString(R.string.wechat_is_not_installed))
}

/**
 * weChat to follow interface
 * @param originalId WeChat public article url attr, pls check wiki
 */
fun Context.openWeChatToFollowInterface(originalId: String) {
    go(goWeChatLauncherUI(originalId), getString(R.string.wechat_is_not_installed))
}

/**
 * aliPay scan
 */
@SuppressLint("NewApi")
fun Context.openAliPayScan() {
    goAndCash(goAliPayScan(), getString(R.string.open_failed))
}

/**
 * aliPay payment code
 */
@SuppressLint("NewApi")
fun Context.openAliPayBarCode() {
    goAndCash(goAliPayBarCode(), getString(R.string.open_failed))
}

/**
 * donate
 *
 * @param config donate data
 */
fun Context.openDonate(config: PayConfig) {
    goAndCash(payIntent(this,config), getString(R.string.open_donation_failed))
}

/**
 * donate data
 */
data class PayConfig(
    val aliZhiKey: String,
    @DrawableRes val aliQaImage: Int,
    @DrawableRes val weChatQaImage: Int,
    val weChatTip: String? = null,
    val aliTip: String? = null
): Serializable