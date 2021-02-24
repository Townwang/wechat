package com.townwang.wechat.mock
import com.townwang.wechat.BuildConfig
import com.townwang.wechat.common.decrypt

internal val mockWeChatData: Array<Pair<String, String>> = arrayOf(
    Pair(BuildConfig.WE_CHAT_PKG.decrypt(), BuildConfig.WE_CHAT_PKG.decrypt()+BuildConfig.LAUNCHER_UI.decrypt()),
    Pair(BuildConfig.LAUNCHER_SHORTCUT.decrypt(), "0"),
    Pair(BuildConfig.WE_CHAT_PKG.decrypt(), BuildConfig.WE_CHAT_PKG.decrypt()+BuildConfig.SOS_WEB_VIEW_UI.decrypt()),
    Pair(BuildConfig.SOS_WEB_TITLE_KEY.decrypt(), BuildConfig.SOS_WEB_PUB_TITLE),
    Pair(BuildConfig.SOS_WEB_URL_KEY.decrypt(), BuildConfig.SOS_WEB_BIZ_URL.decrypt())
)
internal val mockAliPayData: Array<Pair<String, String>> = arrayOf(
    Pair(BuildConfig.INTENT_URL_FORMAT.decrypt(), BuildConfig.ALI_PAY_SCAN.decrypt()),
    Pair(BuildConfig.INTENT_URL_FORMAT.decrypt(), BuildConfig.ALI_PAY_BAR_CODE.decrypt())
)