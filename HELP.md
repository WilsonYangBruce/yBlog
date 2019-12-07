create a new repository on the command line
```
echo "# yBlog" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin git@github.com:WilsonYangBruce/yBlog.git
git push -u origin master
```
push an existing repository from the command line
```
git remote add origin git@github.com:WilsonYangBruce/yBlog.git
git push -u origin master
```