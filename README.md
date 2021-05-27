# simple-fibonacci-java-app
Simple Fibonacci Java command-line app that counts Fibonacci value based on passed index.

This is simple Java command-line application that counts Fibonacci value based on passed index.

If you want to run the app, after cloning/forking this repo:
1. Run `mvn clean package`
2. Run `java -jar ./target/fibonacci-1.0-SNAPSHOT.jar <index_value>`, for example:
<br>`java -jar ./target/fibonacci-1.0-SNAPSHOT.jar 10`

Bear in mind, that when you pass to high index value, then program can hang out, or even crash - this is a simple Java program to give an idea how to count Fibonacci 
value and how you can write some unit test.
