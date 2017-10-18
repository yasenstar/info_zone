# 如何通过代理使用npm install 安装 (2017-10-18)
## 方法一
npm获取配置有6种方式，优先级由高到底。

1. 命令行参数。 --proxy http://server:port即将proxy的值设为http://server:port。

2. 环境变量。 以npm_config_为前缀的环境变量将会被认为是npm的配置属性。如设置proxy可以加入这样的环境变量npm_config_proxy=http://server:port。

3. 用户配置文件。可以通过npm config get userconfig查看文件路径。如果是mac系统的话默认路径就是$HOME/.npmrc。

4. 全局配置文件。可以通过npm config get globalconfig查看文件路径。mac系统的默认路径是/usr/local/etc/npmrc。

5. 内置配置文件。安装npm的目录下的npmrc文件。

6. 默认配置。 npm本身有默认配置参数，如果以上5条都没设置，则npm会使用默认配置参数。

为npm设置代理
```
$ npm config set proxy http://server:port
$ npm config set https-proxy http://server:port
```
如果代理需要认证的话可以这样来设置。
```
$ npm config set proxy http://username:password@server:port
$ npm config set https-proxy http://username:pawword@server:port
```
如果代理不支持https的话需要修改npm存放package的网站地址。
```
$ npm config set registry "http://registry.npmjs.org/"
```
注：由于我的密码含特殊字符，故目前为止还未成功，研究中...

## 方法二
把服务器上的npm，设置代理到可以访问外网的机子上（代理工具：ccproxy、fiddler等），即可解决问题！
```
#npm config set proxy http://proxy.company.com:8080
#npm config set https-proxy http://proxy.company.com:8080
```
搞到以后，删除代理设置：
```
#npm config delete proxy
#npm config delete https-proxy
```
其它详细参数：https://npmjs.org/doc/config.html
附：直接给linux设置网络代理：
```#export http_proxy http://proxy.company.com:8080
#export https_proxy http://proxy.company.com:8080
``` 
前面日志中的例子需运行“npm install formidable”指令安装模块支持文件上传。
如果浏览器有代理服务器，或者办公环境封杀了https，则需要设置npm环境变量。
我看到的错误提示信息是这样：
npm ERR! Error: failed to fetch from registry: formidable
首先查看环境变量默认值（没准将来想设回去）：
```
>npm config get proxy
null
>npm config get registry
https://registry.npmjs.org/
```
然后设置新值：
```
>npm config set registry http://registry.npmjs.vitecho.com
>npm config set proxy=http://10.2.3.4:8080 （此处代理应与浏览器代理设置相同）
```
如果继续安装看到下面的错误提示：
```
npm ERR! Please try running this command again as root/Administrator.
```
解决问题：“以管理员身份运行”cmd
