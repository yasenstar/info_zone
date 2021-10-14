import urllib.request

filename = urllib.request.urlretrieve("http://edu.51cto.com", filename = "/home/yasen/Documents/spider/2.html")
urllib.request.urlcleanup()