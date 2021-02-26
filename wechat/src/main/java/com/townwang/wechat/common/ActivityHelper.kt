package com.townwang.wechat.common

import android.annotation.SuppressLint
import android.app.Activity
import android.content.ActivityNotFoundException
import android.view.View
import android.widget.Toast
import com.townwang.wechat.R
import com.townwang.wechat.openWeChatScan
import java.io.File
import java.net.URISyntaxException
internal fun Activity.goAliPayClient(urlCode: String) {
    return try {
        startActivity(goAliPay(urlCode))
    } catch (e: URISyntaxException) {
        Toast.makeText(this, getString(R.string.url_code_error), Toast.LENGTH_SHORT).show()
    } catch (e: ActivityNotFoundException) {
        Toast.makeText(this, getString(R.string.alipay_is_not_installed), Toast.LENGTH_SHORT).show()
    }
}

@SuppressLint("NewApi")
internal fun Activity.startWeZhi(view: View) {
    val dir = getExternalFilesDir("pay_img")
    if (dir != null && !dir.exists() && !dir.mkdirs()) {
        return
    } else {
        val f = dir?.listFiles()
        f?.forEach {
            it.delete()
        }
    }
    val fileName = System.currentTimeMillis().toString() + "we_chat_q.png"
    val file = File(dir, fileName)
    Thread {
        file.snapShot(baseContext, view)
        runOnUiThread {
            openWeChatScan()
            Toast.makeText(this, "在相册中选择二维码扫描", Toast.LENGTH_SHORT).show()
        }
    }.start()
}