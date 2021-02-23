package com.townwang.wechat.ui

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import com.townwang.wechat.BuildConfig
import com.townwang.wechat.PayConfig
import com.townwang.wechat.R
import com.townwang.wechat.common.goAliPayClient
import com.townwang.wechat.common.restoreAllIllusion
import com.townwang.wechat.common.startWeZhi
import com.townwang.wechat.databinding.ZhiActivityBinding
class ZhiActivity : Activity() {
    private var mZhiWay = 0
    private val binding: ZhiActivityBinding by lazy { ZhiActivityBinding.inflate(layoutInflater) }
    @SuppressLint("NewApi")
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val config =
            intent.getSerializableExtra(BuildConfig.EXTRA_KEY_PAY_CONFIG.restoreAllIllusion())
        config ?: throw IllegalStateException("com.townwang.wechat.PayConfig illegal!!!")
        if (config is PayConfig) {
            binding.zhiBg.setOnClickListener {
                if (mZhiWay == 0) {
                    binding.zhiBg.setBackgroundResource(R.drawable.background_blue_10)
                    binding.zhiTitle.setText(R.string.ali_zhi_title)
                    binding.zhiSummery.text = config.aliTip ?: getString(R.string.ali_zhi_tip)
                    binding.qaImageView.setImageResource(config.aliQaImage)
                } else {
                    binding.zhiBg.setBackgroundResource(R.drawable.background_green_10)
                    binding.zhiTitle.setText(R.string.wei_zhi_title)
                    binding.zhiSummery.text = config.weChatTip ?: getString(R.string.wei_zhi_tip)
                    binding.qaImageView.setImageResource(config.weChatQaImage)
                }
                mZhiWay = ++mZhiWay % 2
            }
            binding.zhiBtn.setOnClickListener {
                if (mZhiWay == 0) {
                    startWeZhi(binding.qaLayout)
                } else {
                    goAliPayClient(config.aliZhiKey)
                }
            }
            binding.zhiBg.setBackgroundResource(R.drawable.background_green_10)
            binding.zhiTitle.setText(R.string.wei_zhi_title)
            binding.zhiSummery.text = config.weChatTip ?: getString(R.string.wei_zhi_tip)
            binding.qaImageView.setImageResource(config.weChatQaImage)
            val animator = ObjectAnimator.ofFloat(binding.tip, "alpha", 0f, 0.66f, 1.0f, 0f)
            animator.duration = 2888
            animator.repeatCount = 6
            animator.interpolator = AccelerateDecelerateInterpolator()
            animator.repeatMode = ValueAnimator.REVERSE
            animator.start()
        }
    }
}