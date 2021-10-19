import urllib.request

url = "https://www.commercialtrucktrader.com"

headers = ("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.71 Safari/537.36")

opener = urllib.request.build_opener()
opener.addheaders = [headers]
data = opener.open(url).read()

fhandle = open("/home/yasen/Documents/spider/3.html", "wb")
fhandle.write(data)
fhandle.close()