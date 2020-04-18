## 厦门炼哥
## 技术-Git

```
【Git-别名相关】
#### 首先在自己配置.ssh的同级目录找到.gitconfig文件 例如Windows系统一般路径是 C:\Users\Administrator\.gitconfig
[user]
	email = 邮箱地址
	name = 密码地址
[alias]
	st = status
	co = checkout
	br = branch
	ci = commit
	last = log -1 HEAD
	lg = log --graph --pretty=format:'%Cred%h%Creset -%C(yellow)%d%Creset %s %Cgreen(%cr) %Cgreen(%ci) %C(bold blue)<%an>%Creset' --abbrev-commit --date=relative

```


```
【Git-分支相关】
创建分支并映射到远程分支
git co -b 本地分支名字 origin/远程分支名字
git push origin 本地分支名字
git push -u origin 本地分支名字(本地分支与远程分支关联)也可以使用 git branch --set-upstream-to=远程分支名(可以通过git brunch -a 来查看)

根据tag创建
git br 本地分支名 tag名

删除远程分支
git branch -r -d origin/branch-name  
git push origin :branch-name

根据CommitId创建分支
git co -b 分支名 Commitid

解决有时候可能远程已经删掉了分支，但本地还看得到
1，先查看那些分支被删掉了。
git remote show origin
2，同步远程最新分支
git remote prune origin

```

```
【Git-特殊技能】
技能1，删除git提交的所有历史提交记录，等同于新建一个仓库
[步骤1] git checkout --orphan latest_branch
[步骤2] git add -A
[步骤3]git commit -am "commit message"
[步骤4]git branch -D master
[步骤5]git branch -m master
[步骤6]git push -f origin master
[步骤7]git pull origin master
[步骤8]git push -u origin master
参考链接 ：https://stackoverflow.com/questions/13716658/how-to-delete-all-commit-history-in-github
```




```
【ADB Shell小命令】
logcat -b events | grep focuse
logcat -b events | grep am_

adb shell dumpsys activity | grep "mFocusedActivity"
adb shell dumpsys activity a| grep "Run #"

adb shell screenrecord /mnt/sdcard/1.mp4
adb pull /mnt/sdcard/1.mp4 c:\KinyangWork\1.mp4


```
