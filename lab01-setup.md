# Setting Up Your 313 Repo

If a Rlab/Plab machine on the linux or Windows side does not already the following installed, please notify a TA. Do NOT
install it yourself.

Make sure the following are installed:
- [Git](https://git-scm.com/downloads)
  - Linux: Run `sudo apt install git`
- [Java 11](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot)
  - Linux: Run `sudo apt install openjdk-11-jdk`
- [NetBeans 11 Linux install](https://flathub.org/apps/details/org.apache.netbeans)

## Terminals

If using Windows, use Git Bash as the terminal. Right-click -> "Git Bash Here", now you have a
linux like terminal!

## How To Add an SSH key to your GitHub

Follow these instructions: 
[howto-add-sshkey-to-github.md](https://github.com/cordell-stocker/CS313.SP20.Student.Resources/blob/master/howto-add-sshkey-to-github.md)

## Set Your Email and Name in Git

Run the following commands:
- `git config --global user.email "<email>"`
- `git config --global user.name "<name>"`

## Cloning your repo

1. go to https://github.com and sign in.
1. go to https://github.com/BlackburnCollege and find your first.last repo
1. Click "Clone or download"
   - Make sure you are using the SSH link (Click "Use SSH"/"Use HTTPS" to switch between the two).
1. Enter `git clone <repo-link>`
   - Example: `git clone git@github.com:BlackburnCollege/john.tuttle.git`
1. Enter `cd <repo-name>`
   - Example: `cd john.tuttle`
   - ***Note: This is the repo's root directory.***

## CS313 Setup

1. Add the following lines to the `.gitigore` file:
   - `*/**/nbproject`
   - `*/**/.idea`
   - `*/**/.gradle`
   
   If you do not have a `.gitignore` file, then create one at the repo's root directory.
1. Enter `mkdir cs313` and change into that directory.
1. Enter `mkdir sp20` and change into that directory.
1. Enter `mkdir written`
1. Enter `mkdir programs`
1. Create and save a temp file inside both the `programs` and `written` directorys.
   - Example: `echo "empty" > temp.txt`
1. Change back to the repo's root directory.
1. Enter `git add .`
   - This stages all files that have been created/modified/deleted to be committed
1. Enter `git commit -m "<message>"`
   - Example `git commit -m "added base folder structure"`
   - This saves the staged changes to the local repo.
1. Enter `git push origin master`
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

### Written Assignments

1. Inside your repo's `cs313/sp20/written` directory, create a directory for the homework.
   - Typically this will be along the lines of `hw01`
2. Add your pdf submission to the appropriate homework folder.
3. Go back to the repo's root directory and run:
   - `git add .`
   - `git commit -m "<message>"` (message might be something like "turned in written hw01"
   - `git push`

```
john.tuttle
|-- cs313
|   |-- sp20
|   |   |-- written
|   |   |   |-- hw01
|   |   |   |   |-- hw01-tuttle.pdf
```

### Program Assignments

Unless otherwise told, all program assignments should be Java Gradle Projects.

You will work on the assignment in your repo. Check the [howto-create-java-gradle-project.md](https://github.com/cordell-stocker/CS313.SP20.Student.Resources/blob/master/howto-create-java-gradle-project.md) file
for instructions.

The program will need to follow a similar structure as written assignments.

Note: To run a gradle project with a "normal" terminal for input/output, do the following:
- Add the following to the `build.gradle` file:
```
run {
    standardInput = System.in
}
```
- Run the program using the command `.\gradlew run -q --console=plain` at the project's root directory.

```
john.tuttle
|-- cs313
|   |-- sp20
|   |   |-- programs
|   |   |   |-- hw01
|   |   |   |   | <gradle project>
```
