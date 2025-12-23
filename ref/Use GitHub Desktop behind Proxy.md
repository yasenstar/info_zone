# Use GitHub Desktop behind Proxy

Date: 2020/04/10 (Montreal, Canada)

1. Set up / Sign in to your account in GitHub Desktoop (This won't be a problem, proxy only doesn't allow you to Add, Create and Clone Repo)

2. Close Github Desktop for the time being(to set up proxy).

3. Go to C:\Users\@yourusername.

4. There you will find a file named .gitconfig

5. Open it with any text editor(I have used sublime text 3) and add

```
[http]
    proxy = http://username:password@your.proxy.address:8080
```

and save.

6. Now you can add, create and clone repos in Github Desktop.

Note(for TFS users): TFS will return 502 bad gateway error when you use the above proxy configuration. Use hash # to comment out the proxy config in .gitconfig to switch between Git and TFS.

Thanks [](https://stackoverflow.com/questions/38615168/how-can-i-configure-github-desktop-windows-to-work-with-a-proxy)