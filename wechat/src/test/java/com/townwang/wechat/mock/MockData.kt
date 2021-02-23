package com.townwang.wechat.mock
import com.townwang.wechat.common.restoreAllIllusion
import org.junit.Test
class MockData {
    @Test
    fun weChatMockDataTest() {
        mockWeChatData.forEach {
            println(it.first.restoreAllIllusion())
            println(it.second.restoreAllIllusion())
        }
    }
    @Test
    fun aliPayMockAliPayData() {
        mockAliPayData.forEach {
            println(it.first.restoreAllIllusion())
            println(it.second.restoreAllIllusion())
        }
    }
}