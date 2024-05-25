Automated Accessibility Testing with Axe Selenium Java
______________________________________________________

Introduction
____________

This README provides guidance on setting up and running automated accessibility tests using Axe Selenium Java. Axe Selenium Java is a library that integrates the Axe accessibility engine with Selenium WebDriver for Java-based projects.

Prerequisites
_____________
Before running the test cases, ensure you have the following prerequisites installed:

1.Java Development Kit (JDK)
2.Maven
3.Chrome or Firefox browser installed

Setup
_____
1.Download Axe Selenium Java Dependency:Download the axe.min.js file from https://github.com/dequelabs/axe-selenium-java and place it in the /src/test/resources directory of your project.
2.Update Maven Dependencies:Add the following dependencies to your pom.xml file:
	WebDriver Manager: https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/
	Selenium Java: https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/
	TestNG: https://mvnrepository.com/artifact/org.testng/testng/
	Axe Selenium: https://mvnrepository.com/artifact/com.deque/axe-selenium/

3.Create Test Scripts:Add your test scripts under src/test directory. You can create new test files (e.g., fileName.java) and write your test cases using Selenium WebDriver.


Running Test Cases
__________________
1. Build the project using Maven:
	mvn clean install
2. Run the test cases:
	mvn test
