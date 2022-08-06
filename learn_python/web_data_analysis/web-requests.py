import requests

DATA = "http://www.baidu.com/"
PAGE = requests.get(DATA)

print(PAGE.text)