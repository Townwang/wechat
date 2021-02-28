package com.townwang.wechat.common
import com.townwang.wechat.BuildConfig
fun String.replaceThis(): String {
    return  replace(BuildConfig.TOWN_THIS,".")
}
fun String.removeSeizeSeat(): String {
    return replace(BuildConfig.TOWN_SEIZE,"")
}

fun String.decrypt():String{
    val a: CharArray = toCharArray()
    for (i in a.indices) {
        a[i] = (a[i] - BuildConfig.SECRET_LETTER.toInt())
    }
    return String(a)
}

fun String.restoreAllIllusion(): String {
    return replaceThis().removeSeizeSeat()
}