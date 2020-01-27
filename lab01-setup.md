# Setting Up Your 313 Repo

If a Rlab/Plab machine on the linux or Windows side does not already the following installed, please notify a TA. Do NOT
install it yourself.

Make sure the following are installed:
- [Git](https://github.com/cordell-stocker/CS.Resources/blob/master/howto-setup-environment.md#howto-install-git)
- [Java 11](https://github.com/cordell-stocker/CS.Resources/blob/master/howto-setup-environment.md#howto-install-java-11)
- [NetBeans 11](https://github.com/cordell-stocker/CS.Resources/blob/master/howto-setup-environment.md#howto-install-netbeans-11)

## Terminals

If using Windows, use Git Bash as the terminal. `right-click` -> `Git Bash Here`, now you have a linux like terminal!

## Add an SSH key to your GitHub And Configure Git

Follow these instructions: 
[howto-add-sshkey-to-github.md](https://github.com/cordell-stocker/CS.Resources/blob/master/howto-add-sshkey-to-github.md)

## Cloning your repo

1. go to https://github.com and sign in.
1. go to https://github.com/BlackburnCollege and find your first.last repo
1. Click "Clone or download"
   - Make sure you are using the SSH link (Click "Use SSH"/"Use HTTPS" to switch between the two).
1. Run `git clone <repo-link>`
   - Example: `git clone git@github.com:BlackburnCollege/john.tuttle.git`
1. Run `cd <repo-name>`
   - Example: `cd john.tuttle`
   - ***Note: This is the repo's root directory.***

## CS313 Initial Setup

1. Add the following lines to the `.gitignore` file:
   - `*/**/nbproject`
   - `*/**/.idea`
   - `*/**/.gradle`
   
   If you do not have a `.gitignore` file, then create one at the repo's root directory.
1. Run `mkdir cs313` and change into that directory.
1. Run `mkdir sp20` and change into that directory.
1. Run `mkdir written`
1. Run `mkdir programs`
1. Create and save a temp file inside both the `programs` and `written` directorys.
   - Example: `echo "empty" > temp.txt`
1. Change back to the repo's root directory.
1. Run `git add .`
   - This stages all files that have been created/modified/deleted to be committed
1. Run `git commit -m "<message>"`
   - Example `git commit -m "added base folder structure"`
   - This saves the staged changes to the local repo.
1. Run `git push origin master`
   - This sends the current state of your local repo to the remote repo (we use GitHub to store 
   our remote repos). More specifically to the `master` branch, which should be your default.

Your final file structure should look like:

```
john.tuttle
|-- cs313
|   |-- sp20
|   |   |-- written
|   |   |   |-- empty.txt
|   |   |-- programs
|   |   |   |-- empty.txt
|-- .gitignore
|-- (other folders/files left out for brevity)
```

## Turnin Process

See [turnin-process.md](https://github.com/cordell-stocker/CS313.SP20.Student.Resources/blob/master/turnin-process.md)

## Shhhhhhhhh....

If you are reading this before doing all the steps above, congratz on reading the whole document before doing anything! Here's a present:

```
mkdir cs313
cd cs313
mkdir sp20
cd sp20
mkdir written
mkdir programs
echo "empty" > written/temp.txt
echo "empty" > programs/temp.txt
cd ../..
git add .
git commit -m "init cs313-sp20"
git push origin master
```
