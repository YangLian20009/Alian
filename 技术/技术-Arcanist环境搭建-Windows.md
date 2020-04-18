## 厦门炼哥
## 技术-Arcanist环境搭建-Windows

```
#### 关于Git PHP Arcanist  的安装标准教程看这里
https://jaycelau.github.io/2018/08/27/Arcanist%E7%8E%AF%E5%A2%83%E7%9A%84%E5%87%86%E5%A4%87(for-Windows)/

#### 但上面漏掉讲了安装Libphutil了，安装Libphutil看这篇文章(直接看第3点就好)
https://www.jianshu.com/p/a6ee738da1aa

####注意的是 Arcanist，Libphutil都需要配置环境变量才能有效，配置到根目录就行
配置完成，系统变量的值应该有三个

(ARC_HOME)E:\workcodes-meiyou\Softs\arcanist
(LIB_PHUTIL)E:\workcodes-meiyou\Softs\libphutil
(PHP_HOME)E:\workcodes-meiyou\Softs\php-7.2.19-Win32-VC15-x64

Path系统变量下面的值应该是
%ARC_HOME%\bin
%LIB_PHUTIL%\bin
%PHP_HOME%\bin

备注：Arc各种操作命令行
https://www.jianshu.com/p/e8d520f65916

最后吐槽，怎么会有这么难用的Code Review工具，好操心，建议大家切Gerrit方式。

```
