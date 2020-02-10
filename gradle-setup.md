# Gradle Project Setup Tutorial With Gradle 6.1

You will be creating a Java application using Gradle build system that you can then open in Netbeans.

1. Open up a terminal on your desktop
1. `ls` to list the files in your working directory
1. cd into your repo, `cd firstname.lastname`
   - Example: `cd john.tuttle`
1. `cd cs313/sp20` 
1. cd into your programs directory, `cd programs`
1. `mkdir hw--` , where "`--`" represents the assignment number.
1. `cd hw--`

## Getting Started

1. Open a terminal ***INSIDE*** the directory you want the Gradle project to be in.
   - Note: The directory you are in will be the root level for the project. So you will probably want to create a new directory and change into it.

1. Inside of the directory
   - Warning: This will generate the project *in* the *current directory*. This will NOT generate the project in a new directory.
   - Run `gradle init`
     - This initializes the Gradle project.
   - You will be prompted for additional input. 

1. Following the prompts:
   1. Select: `application`
      - This will create a project that can be ran.
   1. Select `Java`
      - This will be the language the project uses.
   1. Select `Groovy`
      - This will be the language syntax that Gradle will use for this project.
   1. Select `JUnit4`
      - This will set which Java testing libraries to use.
   1. Project name : `<project-name>`
      - The name of the project.
   1. Source package : `<source-package-name>`
      - All package names must be all lowercase and use `.` (dots) instead of `_` (spaces/underscores/hyphens).
      - Examples:
        - `my.project`
        - `homework01`
        - `project.bomb.vacuum`


## Using `System.in`
Gradle projects do not set a default input stream. So if you want to use `Scanner scanner = new Scanner(System.in);`, you will need to tell Gradle to use `System.in` in the `build.gradle` file.

In the project's root directory, open the `build.gradle` file in a text editor.

You need to add the following lines to this file so Gradle knows to link the input of the console to the running code:
```
run{
    standardInput = System.in
}
```

Finally save the file.

## Build
Make sure you are in your project's root directory. 

1. Run `./gradlew build` .
   - After your project has built, check your tasks to see what else you can do with your application.
You should see a task called `run`.

1. Run `./gradlew run`
   - To have the console not print all the gradle information when running, run using the following command:
     - `./gradlew run -q --console=plain`

If you get a Hello world, then you are successful!