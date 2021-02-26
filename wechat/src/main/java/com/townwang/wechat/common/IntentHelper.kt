package com.townwang.wechat.common

import android.annotation.SuppressLint
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.Uri
import com.townwang.wechat.BuildConfig
import com.townwang.wechat.PayConfig
import com.townwang.wechat.mock.mockAliPayData
import com.townwang.wechat.mock.mockWeChatData
import com.townwang.wechat.ui.ZhiActivity

internal fun goWeChatLauncherUI(): Intent {
    return Intent().also {
        it.component = ComponentName(
            mockWeChatData[0].first.restoreAllIllusion(),
            mockWeChatData[0].second.restoreAllIllusion()
        )
        it.putExtra(
            mockWeChatData[1].first.restoreAllIllusion(),
            mockWeChatData[1].second.restoreAllIllusion() == "0"
        )
    }
}

internal fun goWeChatLauncherUI(originalId:String):Intent{
    return Intent().also {
        it.component = ComponentName(
            mockWeChatData[0].first.restoreAllIllusion(),
            mockWeChatData[0].second.restoreAllIllusion()
        )
        it.putExtra(
            mockWeChatData[2].first.restoreAllIllusion(),
            mockWeChatData[2].second.restoreAllIllusion().format(originalId)
        )
        it.putExtra(
            mockWeChatData[3].first.restoreAllIllusion(),
            mockWeChatData[3].second.restoreAllIllusion().toBoolean()
        )
        it.putExtra(
            mockWeChatData[4].first.restoreAllIllusion(),
            mockWeChatData[4].second.restoreAllIllusion().toInt()
        )
    }
}

@SuppressLint("NewApi")
internal fun goAliPay(urlCode: String): Intent {
    return Intent.parseUri(
        mockAliPayData[0].first.replace("{urlCode}", urlCode).restoreAllIllusion(),
        Intent.URI_INTENT_SCHEME
    )
}

internal fun goAliPayScan(): Intent {
    return Intent().also {
        it.data = Uri.parse(mockAliPayData[0].second.restoreAllIllusion())
    }
}


internal fun goAliPayBarCode(): Intent {
    return Intent().also {
        it.data = Uri.parse(mockAliPayData[1].second.restoreAllIllusion())
    }
}


internal fun payIntent(context: Context, config: PayConfig): Intent {
    return Intent(context, ZhiActivity::class.java).also {
        it.putExtra(BuildConfig.EXTRA_KEY_PAY_CONFIG.restoreAllIllusion(), config)
    }
}

