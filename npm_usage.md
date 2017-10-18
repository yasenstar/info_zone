# 如何通过代理使用npm install 安装
## 方法一
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
