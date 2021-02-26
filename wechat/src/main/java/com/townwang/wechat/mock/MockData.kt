package com.townwang.wechat.mock
import com.townwang.wechat.BuildConfig
import com.townwang.wechat.common.decrypt

internal val mockWeChatData: Array<Pair<String, String>> = arrayOf(
    Pair(BuildConfig.WE_CHAT_PKG.decrypt(), BuildConfig.WE_CHAT_PKG.decrypt()+BuildConfig.LAUNCHER_UI.decrypt()),
    Pair(BuildConfig.LAUNCHER_SHORTCUT.decrypt(), "0"),
    Pair(BuildConfig.USER_KEY.decrypt(), "%s"),
    Pair(BuildConfig.TALKER_KEY.decrypt(), "false"),
    Pair(BuildConfig.COUNT_KEY.decrypt(), "1")
)
internal val mockAliPayData: Array<Pair<String, String>> = arrayOf(
    Pair(BuildConfig.INTENT_URL_FORMAT.decrypt(), BuildConfig.ALI_PAY_SCAN.decrypt()),
    Pair(BuildConfig.INTENT_URL_FORMAT.decrypt(), BuildConfig.ALI_PAY_BAR_CODE.decrypt())
)