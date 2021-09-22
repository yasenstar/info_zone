// date: 2021-09-21

// HTTP模块是Node的核心模块之一，此模块是通过require声明引入的，其结果被赋值到一个局部变量。

var http = require('http');

// 引用完成后，就可以用这个局部变量来实例化Web服务，即http.createServer()函数
// 在下面的函数的参数中，我们用到了回调函数，这是构成Node的基本概念之一。
// 匿名函数会把Web端的请求（request）和响应（respnse）传递给对应的代码，如此一来就可以方便地处理请求并生成对应的响应了。

// Web服务被创建，并且接收到一个Web请求之后，回调函数就会向浏览器发送一个纯文本的响应头（response header）和200的状态码（status code），然后发送Hello World这段信息，最后结束响应。

http.createServer(function (request, response) {
    response.writeHead(200, {'Content-Type': 'text/plain'});
    response.end('Hello World from Yasen\n');
}).listen(8124);

// 创建Web服务的函数调用完成以后，console.log()会将消息打印到终端中。此时程序本身并不会结束或是阻塞，而是在等待接受Web请求。

console.log('Server running at http://127.0.0.1:8124/');