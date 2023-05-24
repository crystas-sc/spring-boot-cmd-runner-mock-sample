# Spring boot command line runner sample
This is a sample project to demonstrate Mocking objects within context initialization

## Output
When profile is set to test the output is
```
Task service from test
```
otherwise
```
Task service from Main
```

## Run command
```
mvn clean test -Dspring.profiles.active=test
```