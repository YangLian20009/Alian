## 厦门炼哥
## 技术-升级Android Studio 错误 ERROR Failed to resolve percent小记

```
错误详情 :
ERROR: Failed to resolve: percent
Affected Modules: news

解决方案 :
参考文档：https://developer.android.google.cn/studio/command-line/sdkmanager
在路径(MAC) /Users/kinyang/Library/Android/sdk/tools/bin 下执行命令
(MAC执行)      sdkmanager --list
(Windows执行   ./sdkmanager.bat --list)
再执行命令
(MAC执行)      sdkmanager "extras;android;m2repository"
(Windows执行)  ./sdkmanager.bat "extras;android;m2repository"

产生原因 :
因为高版本的SDK里面把percent去掉了，而如果是老的工程又需要的话必须得手动执行下载过来才行。


```
