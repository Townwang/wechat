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
                    "fkx083710xkhl4xuxzpud4e",
                    R.mipmap.alipay, R.mipmap.wechat
                )
            )
        }
        binding.attention.setOnClickListener {
            openWeChatToFollowInterface("gh_738e684f3c40")
        }
        binding.add.setOnClickListener {
            openWeChatToFollowInterface("androidsoft")
        }
        binding.aliPayScan.setOnClickListener {
            openAliPayScan()
        }
        binding.aliPayReceive.setOnClickListener {
            openAliPayBarCode()
        }
    }
}