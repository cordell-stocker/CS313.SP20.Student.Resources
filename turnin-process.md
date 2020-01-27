# Turnin Process

## Written Assignments

Homework naming convention: `<homework-title>-<your-last-name>.pdf`
- `<homework-title>` will typically be something like `hw01`

### Turning in:

1. Inside your repo's `cs313/sp20/written` directory, create a directory for the homework.
   - Typically this will be along the lines of `hw01`
2. Add your `pdf` submission to the appropriate homework folder.
3. Go back to the repo's root directory and run:
   - `git add .`
   - `git commit -m "<message>"` \(message might be something like "turned in written hw01"\)
   - `git push origin master`

```
john.tuttle
|-- cs313
|   |-- sp20
|   |   |-- written
|   |   |   |-- hw01
|   |   |   |   |-- hw01-tuttle.pdf
|-- (other folders/files left out for brevity)
```

## Program Assignments

Unless otherwise told, all program assignments should be Java Gradle Projects.

You will work on the assignment in your repo. Check the [howto-create-java-gradle-project.md](https://github.com/cordell-stocker/CS.Resources/blob/master/howto-create-java-gradle-project.md) file
for instructions.

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
