# 如何在ubuntu下使用Github？
原创 2016年05月05日 22:04:12

    标签：
    github

## 安装Git

一个全新的ubunt系统，需要安装Git（系统是不具有该工具的），方法如下：
在terminel中输入如下命令：

```
sudo apt-get install git git-core git-gui git-doc git-svn git-cvs gitweb gitk git-email git-daemon-run git-el git-arch
```

接下来需要检查SSH

因为GitHub会用到SSH，因此需要在shell里检查是否可以连接到GitHub：

```
ssh -T git@github.com
```

如果看到：

```
    Warning: Permanently added ‘github.com,204.232.175.90’ (RSA) to the list of known hosts.
    Permission denied (publickey).
```
则说明可以连接。

这里假设你已经就有了GitHub用户（如果没有，需要去注册GitHub）

## 安装SSH keys

在安装GitHub之前，需要先安装SSH keys

第一步：检查是否已井具有ssh keys，如果已经具有，则进行第二步，否则，进行第三步

```
cd ~/.ssh
ls
```

这里写图片描述

查看该目录下是否已经具有ssh keys，发现并没有id_rsa（私钥）和id_rsa.pub（公钥）这两个文件

第二步：备份并移除已经存在的ssh keys

```
mkdir key_backup
cp id_rsa* key_backup
rm id_rsa* 
```

即将已经存在的id_rsa，id_rsa.pub文件备份到key_backup文件夹

第三步：执行如下命令（不具有ssh keys时）：

```
ssh-keygen -t rsa -C "你自己的github对应的邮箱地址"
```
注1：“”是需要的！
注2：是在ssh目录下进行的！

得到结果如下：
这里写图片描述

发现，id_rsa（私钥）和id_rsa.pub（公钥）这两个文件被创建了
（通过ls查看～/.ssh下面的所有内容查看）

第四步：将刚刚创建的ssh keys添加到github中
（1）利用gedit/cat命令，查看id_rsa.pub的内容
（2）在GitHub中，依次点击Settings -> SSH Keys -> Add SSH Key，将id_rsa.pub文件中的字符串复制进去，注意字符串中没有换行和空格。

第五步：再次检查SSH连接情况（在～/.ssh目录下）：

输入如下命令：

```
ssh -T git@github.com
```

如果看到如下所示，则表示添加成功：

```
    Hi alioth310! You’ve successfully authenticated, but GitHub does not provide shell access.
```
此时，发现github上已有了SSH keys

注1：之前在设置公钥时如果设置了密码，在该步骤会要求输入密码，那么，输入当时设置的密码即可。

注2：通过以上的设置之后，就能够通过SSH的方式，直接使用Git命令访问GitHub托管服务器了
开始使用github

参考廖雪峰github教程；Github 简明教程
；Linux操作Git远程仓库与本地仓库同步的教程；

## 配置git

即利用自己的用户名和email地址配置git

```
git config --global user.name "你的github用户名"
git config --global user.email "你的github邮箱地址"
```
## 如何推送本地内容到github上新建立的仓库
github上新建立仓库

具体内容不做介绍，假设，新建的仓库为dockerfiels
在本地建立一个目录

该目录名称与github新建立的目录相同，假设本地目录为~/Document/dockerfiles
本地仓库初始化

```cd ~/Document/dockerfiles
git init
```
对本地仓库进行更改

例如，添加一个Readme文件

```
touch Readme
```
对刚刚的更改进行提交

该步不可省略！

```
git add Readme
git commit -m 'add readme file'
```
push

首先，需要将本地仓库与github仓库关联
注：https://github.com/你的github用户名/你的github仓库.git 是github上仓库的网址

```
git remote add origin https://github.com/你的github用户名/你的github仓库.git  
```
然后，push，此时，可能需要输入github账号和密码，按要求输入即可

```
git push origin master
```
如何推送本地内容到github上已有的仓库
从github上将该仓库clone下来

```
git clone https://github.com/你的github用户名/github仓库名.git  
```
对clone下来的仓库进行更改

例如，添加一个新的文件

```
touch Readme_new
```
对刚刚的更改进行提交

该步不可省略！(其实是提交到git缓存空间)

```
git add Readme_new
git commit -m 'add new readme file'
```
push

首先，需要将本地仓库与github仓库关联
注：https://github.com/你的github用户名/你的github仓库.git 是github上仓库的网址

```
git remote add origin https://github.com/你的github用户名/你的github仓库.git  
```
有时，会出现fatal: remote origin already exists.，那么，需要输入git remote rm origin 解决该问题

然后，push，此时，可能需要输入github账号和密码，按要求输入即可

```
git push origin master
```
注：有时，在执行git push origin master时，报错：error:failed to push som refs to…….，那么，可以执行

```
git pull origin master
```
至此，github上已有的仓库的便有了更新

如果需要添加文件夹，有一点需要注意：该文件夹不能为空！否则不能成功添加
操作命令小结

    克隆github上已有的仓库

```
git clone https://github.com/你的github用户名/github仓库名.git
```
    或者是在github上新建仓库并且在本地新建同名的仓库

```
cd ~/Document/dockerfiles
git init
```
    对本地仓库内容进行更改（如果是多次对本地的某个仓库进行这样的操作，直接从此步开始即可，不要前面的操作了，因为本地仓库已有具有了github仓库的.git文件了）

    对更改内容进行提交

```
git add 更改文件名或者是文件夹名或者是点"."
git commit -m "commit内容标注"
```
    本地仓库与github仓库关联

```
git remote add origin https://github.com/你的github用户名/你的github仓库.git  
```
    push

```
git push origin master
```
注：另外可能用到的命令

```
git remote rm origin
git pull origin master
```
查看当前git缓存空间状态

```
git status
```
版权声明：本文为博主原创文章，如需转载，请注明出处：http://blog.csdn.net/tina_ttl 
