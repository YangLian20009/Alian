## 厦门炼哥
## 技术-一次性解决git每次都要ssh-add的问题Windows&Mac


### Windows平台处理方式
```
步骤1：找到git安装目录下面的 etc\bash.bashrc 文件，（例如我的全路径是 D:\install\Git\etc\bash.bashrc ）
步骤2：在这个文件的最后一行添加如下命令
eval "$(ssh-agent -s)"
ssh-add ~/.ssh/id-rsa
ssh-add ~/.ssh/自己的rsa1
ssh-add ~/.ssh/自己的rsa2
步骤3：彻底退git-bash软件，重新启动

[题外话：Windows命令终端可以使用cmder，不过cmder里面可能会遇到设置别名不生效问题]

注意:如果想要在Android Studio里面默认Terminal窗口也可以自动执行的话
可以在File->Seetings->Tools->Terminal-ShellPath设置成 D:\install\Git\bin\bash.exe
```

### MAC平台处理方式
```
步骤1：打开Iterm2->Preferents->Profiles->Gerenal里面有个Commend(LoginShell)
步骤2：填写命令
eval $(ssh-agent)   "ssh-add ~/.ssh/id-rsa  ~/.ssh/自己的rsa1  ~/.ssh/自己的rsa2"
步骤3：彻底退Iterm2软件，重新启动

[题外话：MAC终端神器肯定是Iterm2了，如果还在用原生的终端的话，赶紧换过来吧]

注意：上面情况有在安装iTerm2的时候有好使，但有的用户可能没有安装或者打开带命令行的软件
想要在软件里面（例如Android Studio,VSCODE）的Terminal执行的话就会遇到不生效的问题
这个时候可以直接在mac的.bash_profiel里面通过别名的方式来解决

步骤1，在你的.bash_profile添加如下变量
export SSH_AGENT='eval $(ssh-agent)  "ssh-add ~/.ssh/id-rsa  ~/.ssh/自己的rsa1 ~/.ssh/2"'
alias xssh=$SSH_AGENT

步骤2，你在的带Terminal窗口的软件里面直接输入xssh就可以全部激活了。[同时 iTerm2里面的Commeend (Login Shell)可以直接成别名 xssh 了]

```
