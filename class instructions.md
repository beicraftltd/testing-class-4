```sh
1. git clone https://github.com/beicraftltd/testing-class-4.git


create a branch after just starting to work | checkout means to push all works to clone your work from existing branch into the new branch.

2. git checkout -b framework/setup


completed work for the day

3. git status (expecting files to be red)

4. git add "simon/read me.txt"   ==== add specific file
4. git add .                     ==== adds all files

5. git status (expecting all files to be green)

6. git commit -m "added simon/read me.txt"

ready to push it into the remote repository:
- always remember check if the remote is ahead of your local branch 

7. git pull origin main


8. git push -u origin framework/setup
```