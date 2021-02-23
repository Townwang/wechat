# wechat
[![License](https://img.shields.io/badge/License%20-Apache%202-337ab7.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![Arsenal](https://img.shields.io/badge/Arsenal%20-%20SmartRefresh-4cae4c.svg)](#)
[![JCenter](https://img.shields.io/badge/%20JCenter%20-1.0.3-5bc0de.svg)](https://bintray.com/townwang/WeChat/wechat/_latestVersion)
[![MinSdk](https://img.shields.io/badge/%20MinSdk%20-%2012%2B%20-f0ad4e.svg)](https://android-arsenal.com/api?level=12)
[![Methods](https://img.shields.io/badge/Methods%20%7C%20Size%20-%2031%20%7C%2018.2%20KB-d9534f.svg)](#)

全网首发开发人员的微信API, 可无API,无权限实现一键关注公众号.一键利用微信内置浏览器打开任何网址. 附带功能 -> 个人捐赠,支付宝直接捐赠功能. api 正在不断新增

## 使用方式
### 在**build.gradle**引入如下库
```kotlin
implementation 'com.townwang:wechat:1.0.3'
```
### 下载Simple查看效果
 蓝奏云下载地址:  [![apk](https://img.shields.io/badge/Apk-v1.0-green)](https://town.lanzous.com/ifoDvm2820j)
## 打开捐赠

### Kotlin 使用方式
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
### java 使用方式
```java
/**
 * @param config 传入PayConfig对象 即: (支付宝key,支付收款码,微信收款码)
 */
 PayConfig payConfig = new PayConfig("fkx083710xkhl4xuxzpud4e",R.mipmap.alipay, R.mipmap.wechat,null,null);
 WeChatHelper.openDonate(this,payConfig);
```
> 参数说明 
[支付宝Code如何获取?](https://github.com/Townwang/wechat/wiki/%E6%94%AF%E4%BB%98%E5%AE%9DCode%E5%A6%82%E4%BD%95%E8%8E%B7%E5%8F%96%3F)

### 使用效果
![支付.png](https://i.loli.net/2021/02/23/AqX6DLNmtv1TQiM.png)
## 打开微信关注页
### kotlin 使用方式
```kotlin
/**
 * @param bizCode 传入微信公众号bizCode
 * @param title 打开时顶部提示文字 (不填为默认)
 */
openWeChatToFollowInterface("MzA4NTY4ODUzOQ")
```
### java 使用方式
```java
/**
 * @param context 上下文对象
 * @param bizCode 传入微信公众号bizCode
 * @param title 打开时顶部提示文字 (使用默认填null即可)
 */
 WeChatHelper.openWeChatToFollowInterface(this, "MzA4NTY4ODUzOQ",null);
```
> 参数说明
[公众号bizCode如何获取?](https://github.com/Townwang/wechat/wiki/%E5%85%AC%E4%BC%97%E5%8F%B7bizCode%E6%80%8E%E4%B9%88%E8%8E%B7%E5%8F%96%3F)

### 使用效果
![device-2021-02-23-201605.png](https://i.loli.net/2021/02/23/bwcaiLTnN9KRPjk.png)
## 打开微信并加载Url
### kotlin 使用方式
```kotlin
/**
 * @param url 任意Url
 * @param title 打开时顶部提示文字 (不填为默认)
 */
openWeChatLoadUrl("https://mp.weixin.qq.com/s/Zrj_Dbx6COy8npwgPNf9tQ","在下方留言代表你来过")
```
### java 使用方式
```java
/**
 * @param context 上下文对象
 * @param url 任意Url
 * @param title 打开时顶部提示文字 (使用默认填null即可)
 */
WeChatHelper.openWeChatLoadUrl(this, "https://mp.weixin.qq.com/s/Zrj_Dbx6COy8npwgPNf9tQ","在下方留言代表你来过");
```
### 使用效果
![22222222.png](https://i.loli.net/2021/02/23/RhbdGDFVoAgyUSj.png)
## 打开支付宝扫描
### kotlin 使用方式
```kotlin
openAliPayScan()
```
### java 使用方式
```java
/**
 * @param context 上下文对象
 */
  WeChatHelper.openAliPayScan(this);
```

## 打开支付宝付款码
### kotlin 使用方式
```kotlin
openAliPayBarCode()
```
### java 使用方式
```java
/**
 * @param context 上下文对象
 */
WeChatHelper.openAliPayBarCode(this);
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

