// date: 2021-09-21, upgraded version

var http = require('http');
var fs = require('fs');

http.createServer(function (req, res) {
    var name = require('url').parse(req.url, true).query.name;

    if (name == undefined) name = 'world';

    if (name == 'burningbird') {
        var file = 'phoenix5a.png';
        fs.stat(file, function(err, stat) {
            if (err) {
                console.error(err);
                res.writeHead(200, {'Content-Type': 'text/plain'});
                res.end("Sorry, Burningbird is not around right now \n");
            } else {
                var img = fs.readFileSync(file);
                res.contentType = 'image/png';
                res.contentLength = stat.size;
                res.end(img, 'binary');
            }
        });
    } else {
        res.writeHead(200, {'Content-Type': 'text/plain'});
        res.end('Hello ' + name + '\n');
    }
}).listen(8124);

console.log('Server running at http://127.0.0.1:8124/');

// 使用 ?name=burningbird 作为参数来访问此应用，就会调出存放在同一目录下面的 phoenix5a.png 图片