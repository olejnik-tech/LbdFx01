# LbdFx01
First learning project for JavaFX education purposes (Lbd stands for "Learning by Doing")

## Technology / Versions
- Workspaces
  - Debian 10 on laptop
  - Debian GNU/Linux 10 on workstation (in virtualbox 6.1)
- IDE: Jetbrains - Idea (2021.2.2)
- OpenJDK 11 SDK
- Gradle -v 6.9.1
  `gradle wrapper --gradle-version 6.9.1`
- JavaFX 17.0.1

## JavaFX init
openjfx-17.0.1_linux-x64_bin-sdk
- In Idea > Project Structure > Libraries > Add > javafx-sdk-17.0.1/src.zip
- Right click on JavaFX library > add to modules > select all and add
- Project Structure > Modules > Select all > Check Dependencies tab if JavaFX is checked

### JavaFX errors:
java.lang.RuntimeException: Unable to parse --add-exports <module>=<value>: javafx.controls
- Check settings project above

## Learning Sources
`https://www.tutorialspoint.com/javafx/index.htm`

` https://www.youtube.com/watch?v=nKIMGH0l3Wo&ab_channel=PaulGestwicki `