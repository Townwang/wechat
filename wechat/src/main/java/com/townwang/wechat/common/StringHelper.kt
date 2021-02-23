package com.townwang.wechat.common

import com.townwang.wechat.BuildConfig

fun String.replaceThis(): String {
    return  replace(BuildConfig.TOWN_THIS,".")
}
fun String.removeSeizeSeat(): String {
    return replace(BuildConfig.TOWN_SEIZE,"")
}
fun String.restoreAllIllusion(): String {
    return replaceThis().removeSeizeSeat()
}