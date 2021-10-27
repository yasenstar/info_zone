# net use Command

|用途|命令|
|---|---|
|删除已有的连接，避免出现“一个用户使用...多重连接”的问题|net use * /delete|
|建立空连接|net use \\IP\ipc$ "" /user:"" (一定要注意:这一行命令中包含了3个空格)|
|建立非空连接|net use \\IP\ipc$ "密码" /user:"用户名" (同样有3个空格)|
|映射默认共享|net use z: \\IP\c$ "密码" /user:"用户名" (即可将对方的c盘映射为自己的z盘，其他盘类推); 如果已经和目标建立了ipc$，则可以直接用IP+盘符+$访问,具体命令 net use z: \\IP\c$|
|删除一个ipc$连接|net use \\IP\ipc$ /del|
|删除共享映射|net use c: /del 删除映射的c盘，其他盘类推; 或者net use * /del 删除全部,会有提示要求按y确认|
|查看远程主机的共享资源（但看不到默认共享）|net view \\IP|
|查看本地主机的共享资源（可以看到本地的默认共享）|net share|
|得到远程主机的用户名列表|nbtstat -A IP|
|得到本地主机的用户列表|net user|
|查看远程主机的当前时间|net time \\IP|
|显示本地主机当前服务|net start|
|启动/关闭本地服务|net start 服务名 /y；或者net stop 服务名 /y|
|映射远程共享|net use z: \\IP\baby, 此命令将共享名为baby的共享资源映射到z盘|
|删除共享映射|net use c: /del 删除映射的c盘，其他盘类推；或者net use * /del /y删除全部|
|激活用户/加入管理员组|1 net uesr account /active:yes；2 net localgroup administrators account /add|
|删除一个已建立的ipc$连接|net use \\IP\ipc$ /del|

整理日期：2020/01/28
