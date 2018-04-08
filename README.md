# serverside-test
Java console application for groceries.

I used the following external libs for develope:
	- javax.json for JSON malipulation and build
	- jsoup for HTTPS connect and find tags on the page via css selectors
	- junit for unit testing

1. Build Application in a root folder like:
	mvn package
	
2. Run the Application:
	java -jar target/serverside_test-1.0-SNAPSHOT.jar

Class Path:
D:.
|   .gitignore
|   pom.xml
|   README.md
|           
+---src
    +---main
    |   |   
    |   \---java
    |       \---com
    |           \---sainsburys
    |               \---serverside_test
    |                       BuildJSONResult.java
    |                       HTTPFetcher.java
    |                       Main.java
    |                       ProductDetails.java
    |                       TransformProductDataToJSON.java
    |                       
    \---test
        |   
        +---java
            \---com
                \---sainsburys
                    \---serverside_test
                            ProductDetailsTest.java

If I have more freetime I will created own Exceptions for HTTPFetcher and BuildJSONResult classes.