package com.townwang.wechat.common

import android.content.Context
import android.content.Intent
import android.widget.Toast

internal fun Context.go(intent: Intent, msg: String) {
    if (packageManager.isExist(intent)) {
        intent.action = Intent.ACTION_VIEW
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    } else {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}

internal fun Context.goAndCash(intent: Intent, msg: String) {
    try {
        intent.action = Intent.ACTION_VIEW
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    } catch (e: Exception) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}

