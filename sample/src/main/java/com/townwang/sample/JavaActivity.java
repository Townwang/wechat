package com.townwang.sample;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.townwang.sample.databinding.ActivityMainBinding;

public class JavaActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootView = binding.getRoot();
        setContentView(rootView);
        binding.donate.setOnClickListener(v->{
//           ApiHelper.PayConfig payConfig = new ApiHelper.PayConfig("fkx083710xkhl4xuxzpud4e",
//                    R.mipmap.alipay, R.mipmap.wechat,null,null);
//            ApiHelper.getInstance().openDonate(this,payConfig);
        });

        binding.attention.setOnClickListener(v-> {
//             ApiHelper.getInstance().openWeChatToFollowInterface(this, "MzA4NTY4ODUzOQ",null);
        });
        binding.openArticle.setOnClickListener(v-> {
//             ApiHelper.getInstance().openWeChatLoadUrl(this, "https://mp.weixin.qq.com/s/Zrj_Dbx6COy8npwgPNf9tQ",null);
        });
        binding.aliPayScan.setOnClickListener(v-> {
//             ApiHelper.getInstance().openAliPayScan(this);
        });
        binding.aliPayReceive.setOnClickListener(v-> {
//             ApiHelper.getInstance().openAliPayBarCode(this);
        });
    }
}
