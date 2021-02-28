# wechat
[![License](https://img.shields.io/badge/License%20-Apache%202-337ab7.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![JitPack](https://jitpack.io/v/com.townwang/wechat.svg)](https://jitpack.io/#com.townwang/wechat)
[![JCenter](https://api.bintray.com/packages/townwang/WeChat/wechat/images/download.svg) ](https://bintray.com/townwang/WeChat/wechat/_latestVersion)
[![MinSdk](https://img.shields.io/badge/%20MinSdk%20-%2012%2B%20-f0ad4e.svg)](https://android-arsenal.com/api?level=12)
[![Methods](https://img.shields.io/badge/Methods%20%7C%20Size%20-%2031%20%7C%2018.2%20KB-d9534f.svg)](#)

全网首发开发人员的微信API, 可无API,无权限实现三方app内一键关注公众号.一键加好友. 附带功能 -> 个人捐赠,支付宝直接捐赠功能. api 正在不断新增

## 使用方式
### 在**build.gradle**引入如下库
```kotlin
implementation 'com.townwang:wechat:_latestVersion'
```
### 下载Simple查看效果
 蓝奏云下载地址:  [![apk](https://img.shields.io/badge/Apk-v1.0-green)](https://town.lanzous.com/ioMCYm8ddab)
## 打开捐赠

### 使用方式
```kotlin
/**
 * @param config 传入PayConfig对象 即: (支付宝Code,支付收款码,微信收款码,微信提示消息[可选参数],支付宝提示消息[可选参数])
 */
 openDonate(
      PayConfig(
            "fkx083710xkhl4xuxzpud4e",
            R.mipmap.alipay, R.mipmap.wechat
               )
          )
```
> 参数说明 
[支付宝Code如何获取?](https://github.com/Townwang/wechat/wiki/%E6%94%AF%E4%BB%98%E5%AE%9DCode%E5%A6%82%E4%BD%95%E8%8E%B7%E5%8F%96%3F)

### 使用效果
![支付.png](https://i.loli.net/2021/02/23/AqX6DLNmtv1TQiM.png)
## 打开微信关注页
### 使用方式
```kotlin
/**
 * @param originalId 传入微信公众号原始ID
 */
openWeChatToFollowInterface("gh_738e684f3c40")
```
> 参数说明
[公众号原始ID如何获取?](https://github.com/Townwang/wechat/wiki/%E5%85%AC%E4%BC%97%E5%8F%B7%E5%8E%9F%E5%A7%8BID%E6%80%8E%E4%B9%88%E8%8E%B7%E5%8F%96%3F)

### 使用效果
![image.png](https://i.loli.net/2021/02/27/XMg1jvHTq6JnYZk.png)
## 打开微信并加好友
### 使用方式
```kotlin
/**
 * @param originalId 传入微信号
 */
openWeChatToFollowInterface("androidsoft")
```

### 使用效果
![image.png](https://i.loli.net/2021/02/27/Cg1EKtBim52fXAv.png)
## 打开支付宝扫描
### 使用方式
```kotlin
openAliPayScan()
```

## 打开支付宝付款码
### 使用方式
```kotlin
openAliPayBarCode()
```

## License
  Copyright [2021] [Townwang]
  
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

