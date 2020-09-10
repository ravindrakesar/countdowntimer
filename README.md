# countdowntimer
Verify the countdown timer
Feature file present at BDDCucumberSelenium\src\test\resources\Countdown.feature
Step definitions present at BDDCucumberSelenium\src\test\java\stepDefs\CountDownSteps.java
Pages present at BDDCucumberSelenium\src\test\java\pages\CountDownPage.java
All necessary jar files are present in BDDCucumberSelenium\libs
Required chrome browser is present in BDDCucumberSelenium\browser\chromedriver.exe
Test result file present in BDDCucumberSelenium\Test Results - Feature__Countdown.html

Execution steps :
Downlaod the project and open in IntelliJ Idea editor
Go to Countdown.feature file , right click and Run it
In the Edit config, add step definitions path in the glue
The feature file will open the chrome browser, open the requried website and runs the test
The test will print the countdown in the console
After which the test will abort

We can export the test report using the IntelliJ editor which will be a html report
Open the html report in IE to see the results

Improvements :
This is a non maven project, maven pom.xml can be added with required dependencies 
Test runner file can be added
Screenshots can be captured
Extent reports can be added
Logs can be added
