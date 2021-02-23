package com.townwang.wechat.common

import android.content.Intent
import android.content.pm.PackageManager

internal fun PackageManager?.isExist(intent: Intent): Boolean {
    this ?: return false
    return queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY).isNotEmpty()
}