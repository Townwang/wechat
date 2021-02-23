package com.townwang.sample;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.townwang.sample.databinding.ActivityMainBinding;
import com.townwang.wechat.PayConfig;
import com.townwang.wechat.WeChatHelper;
public class JavaActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootView = binding.getRoot();
        setContentView(rootView);
        binding.donate.setOnClickListener(v->{
           PayConfig payConfig = new PayConfig("fkx083710xkhl4xuxzpud4e",
                    R.mipmap.alipay, R.mipmap.wechat,null,null);
            WeChatHelper.openDonate(this,payConfig);
        });

        binding.attention.setOnClickListener(v-> {
            WeChatHelper.openWeChatToFollowInterface(this, "MzA4NTY4ODUzOQ",null);
        });
        binding.openArticle.setOnClickListener(v-> {
            WeChatHelper.openWeChatLoadUrl(this, "https://mp.weixin.qq.com/s/Zrj_Dbx6COy8npwgPNf9tQ",null);
        });
        binding.aliPayScan.setOnClickListener(v-> {
            WeChatHelper.openAliPayScan(this);
        });
        binding.aliPayReceive.setOnClickListener(v-> {
            WeChatHelper.openAliPayBarCode(this);
        });
    }
}
