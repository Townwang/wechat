package com.townwang.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.townwang.sample.databinding.ActivityMainBinding
import com.townwang.wechat.*

class KotlinActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.donate.setOnClickListener {
            openDonate(
                PayConfig(
                    "fkx12494k3mmyp9qni1bv54",
                    R.mipmap.alipay, R.mipmap.wechat
                )
            )
        }
        binding.attention.setOnClickListener {
            openWeChatToFollowInterface("MzA4NTY4ODUzOQ")
        }
        binding.openArticle.setOnClickListener {
            openWeChatLoadUrl("https://mp.weixin.qq.com/s/Zrj_Dbx6COy8npwgPNf9tQ","在下方留言代表你来过")
        }
        binding.aliPayScan.setOnClickListener {
            openAliPayScan()
        }
        binding.aliPayReceive.setOnClickListener {
            openAliPayBarCode()
        }

    }
}