import urllib.request

file = urllib.request.urlopen("http://www.baidu.com")

data = file.read()
dataline = file.readline()

print(data)
print(dataline)

fhandle = open("/home/yasen/Documents/spider/1.html", "wb")
fhandle.write(data)
fhandle.close()