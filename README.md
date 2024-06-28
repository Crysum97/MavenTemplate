# Basic Maven Template

## Included Libraries/ Frameworks
 - JUnit 5
 - MariaDB JDBC

## Used Maven Plugins
 - Exec
 - Surefire
 - Surefire-Report


## Maven commands
Within IntelliJ press ```Ctrl``` twice to access "Run anything".
There you can run any Maven command. If you are new to using Maven, you can try this workflow:
- ```mvn clean``` - Removes any existing artefacts
- ```mvn compile``` - Compiles the source code
- ```mvn exec:java``` - Executes the main-method located within the HelloWorld.java
- ```mvn test``` - Runs the test cases
- ```mvn clea compile exec:java test``` - Does everything of the above