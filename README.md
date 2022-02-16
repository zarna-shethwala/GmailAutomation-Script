# GmailSendAndVerifyScript
This repository contains an automation script to do gmail login, compose an email and send a mail to recipient.

Steps to clone the Repository:
1. Go to Code and Click on it.
2. Copy the provided HTTPS link and go to specific folder where you want to clone it.
3. Type git clone RepoLink. It will download the repository.
4.Once downloaded, open it in Eclipse or any IDE.

Steps to Download Zip File:
1.Go to Code and Click on it.
2.Click on the Download Zip, it will download the zip file in the system.
3.Once downloaded,extract it to any specific location and open it in Eclipse or any IDE.

Decription about the Project:
The script has been made using selenium-cucumber framework (Java) with Gherkin Language using maven dependancies.

1.pom.xml File:
-This file contains all the necessary maven dependancies for the project.
-Added Dependancies : Cucumber Java | Cucumber Junit | JUnit | Selenium Java | Cucumber Maven Report 

2.src/test/resources Folder
-This folder has two sub folders:
    1.Drivers : it contains chromedriver.exe(98.0.4758.102 version) executable file to run the project on Chrome Browser(98.0.4758.102) in Windows OS.
    2.Features : This folder contains feature file for the given Scenario of the project using Gherkin Language.
   
3.src/test/java Folder
-This folder has sub folder named StepDefination.
     StepDefinations : This folder contains two file named GmailSendAndVerifyStepDefination.java and TestRunner.java
        1. GmailSendAndVerifyStepDefination.java : This file has all the methods and implementations which are neccessary to successfully implement the given scenario.
        2. TestRunner.java : This file has methods and implementations which will run the automation script. 
    
Steps to Run the Script using IDE :
1. Do Right Click on the project and select Run As --> JUnit
2. It will run the script and generate a report.

Steps to Run the Script using Command :
1. Open Command Line and go to the location of project.
2.Type "mvn verify" command to run the project and generate a report.
(NOTE : To run the script using command, maven should be added globally in the system.)

To See generated report :
1. Go to project in IDE and refresh(Right Click on the project-->Refresh/Press F5)it.
2. Go to target-->HtmlReports.html and open it.
3. You will see the generated report.






