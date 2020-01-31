# Turnin Process

## Tips When Reading Instructions
- Never blindly follow instructions! Make sure you actually understand what is going on.
If you don't, spend some time on Google.
- Read the entire instructions before starting to actually work.
  - You may find that the instructions are for something completely different than what you are wanting.
  - Maybe the instructions start using weird third-party tools half-way through that you don't want.
    - Maybe you know a different way than using the third-party tools, in which case you can still use the
      instuctions. In computer science, there's always more than one way!
- Pay attention to results of commands. Sometimes errors happen which could be caused by many reasons:
  - Typed the command wrong.
  - APIs are different between versions.
    - Example: previous version you could call `make cat with hat`, but now you have to call `make a cat in a hat`. 
      Developers make many changes, this is why it is important to fully understand what the commands 
      are trying to accomplish!
  - The author of the instructions wrote down the wrong command or used the wrong formatting 
  \(more common than you may think!\).
    - Reading the entire instructions before starting can help with this problem. You might be able to
      figure out what the author was trying to do.
- If you're unsure how a command is supposed to be formatted, look up examples!

### Harsh Lesson

If you're only goal is to finish as quickly as possible, you're in the wrong major. You need to actually understand
what you are typing. Understanding sometimes means hours of researching, testing, and trial and error. Sometimes
certain things take years to even begin to actually understand \(e.x. JavaFX\).

# Instructions

## Written Assignments

### Naming Conventions

Files must be named properly as automated scripts will make copies of your files!

Homework naming convention: `<homework-title>-<your-last-name>.pdf`
- `<homework-title>` will typically be something like `hw01`

Examples:
- `hw01-tuttle.pdf`
- `hw02-tuttle.pdf`

If you have multiple files to turn in use the naming convention: `<homework-title>-file<file-number>-<last-name>`

Examples:
- `hw05-file1-tuttle.pdf`
- `hw05-file2-tuttle.pdf`
- `hw05-file3-tuttle.pdf`

### Turning in:

**The turnin directory MUST be named properly, as automated scripts will be used to make copies of your homework!**

1. Inside your repo's `cs313/sp20/written` directory, create a directory for the homework.
   - Typically this will be along the lines of `hw01`
2. Add your `pdf` submission\(s\) to the appropriate homework folder.
3. Go back to the repo's root directory and run:
   - `git add .`
   - `git commit -m "<message>"` \(message might be something like "turned in written hw01"\)
   - `git push origin master`

Examples:
```
john.tuttle
|-- cs313
|   |-- sp20
|   |   |-- written
|   |   |   |-- hw01
|   |   |   |   |-- hw01-tuttle.pdf
|-- (other folders/files left out for brevity)
```
```
john.tuttle
|-- cs313
|   |-- sp20
|   |   |-- written
|   |   |   |-- hw05
|   |   |   |   |-- hw05-file1-tuttle.pdf
|   |   |   |   |-- hw05-file2-tuttle.pdf
|   |   |   |   |-- hw05-file3-tuttle.pdf
|-- (other folders/files left out for brevity)
```

## Program Assignments

Unless otherwise told, all program assignments should be Java Gradle Projects.

You will work on the assignment in your repo. Check the [howto-create-java-gradle-project.md](https://github.com/cordell-stocker/CS.Resources/blob/master/howto-create-java-gradle-project.md) file
for instructions.

**The turnin directory MUST be named properly, as automated scripts will be used to make copies of your homework!**

The program will need to follow a similar structure as written assignments.

```
john.tuttle
|-- cs313
|   |-- sp20
|   |   |-- programs
|   |   |   |-- hw01
|   |   |   |   | <project>
```

### Note:
To run a gradle project with a "normal" terminal for input/output, do the following:
- Add the following to the `build.gradle` file:
```
run {
    standardInput = System.in
}
```
- Run the program using the command `.\gradlew run -q --console=plain` at the project's root directory.
