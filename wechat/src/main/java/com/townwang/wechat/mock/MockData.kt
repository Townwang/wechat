package com.townwang.wechat.mock
import com.townwang.wechat.BuildConfig
internal val mockWeChatData: Array<Pair<String, String>> = arrayOf(
    Pair(BuildConfig.WE_CHAT_PKG, BuildConfig.WE_CHAT_PKG+BuildConfig.LAUNCHER_UI),
    Pair(BuildConfig.LAUNCHER_SHORTCUT, "0"),
    Pair(BuildConfig.WE_CHAT_PKG, BuildConfig.WE_CHAT_PKG+BuildConfig.SOS_WEB_VIEW_UI),
    Pair(BuildConfig.SOS_WEB_TITLE_KEY, BuildConfig.SOS_WEB_PUB_TITLE),
    Pair(BuildConfig.SOS_WEB_URL_KEY, BuildConfig.SOS_WEB_BIZ_URL)
)
internal val mockAliPayData: Array<Pair<String, String>> = arrayOf(
    Pair(BuildConfig.INTENT_URL_FORMAT, BuildConfig.ALI_PAY_SCAN),
    Pair(BuildConfig.INTENT_URL_FORMAT, BuildConfig.ALI_PAY_BAR_CODE)
)