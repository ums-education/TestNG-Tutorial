# TestNG-Tutorial
This is the first project on TestNG

## What is TestNG?
It is simply a testing framework.
TestNG stands for Testing - Next Generation.
It takes the best from other popular frameworks (i.e., JUnit, NUnit) and adds to them.
It will allow us to design, control and manipulate standalone testing frameworks.

## Why TestNG?
- It is one of the most popular (if not THE most popular) testing frameworks.
- It allows more flexibility and control compared to other frameworks.
- It has more selection of annotations.
- It has .xml files which give us unlimited control and flexibility to manage our frameworks.

## Annotations in TestNG
TestNG provides a hierarchy of annotations to control the flow of execution. The following is the order of execution of annotations if they are present in the test suite:
- @BeforeSuite: gets executed only once before anything else. Used to initialize global variables, define dependencies, establish connections, etc.
  - @BeforeTest: gets executed only once before every test category as defined within the .xml file. Used to initialize variables, establish connections, instantiates objects, etc. that are necessary for the test to run. 
	- @BeforeClass: gets executed only once and before any other method within the class that it is defined at. Used to initialize class variables and perform other necessary setup actions that might be necessary for the methods within the class.
	  - @BeforeMethod: gets executed **every time** before a @Test method that is in the same class. Usually used for local variable initializations and local setups.
		- @Test: the core annotation and the core method. Each @Test is executed once unless otherwise defined via attributes and/or .xml file.
	  - @AfterMethod: gets executed **every time** after a @Test method that is in the same class. Usually used for local variable nullification and local tear downs.
	- @AfterClass: gets executed only once and after any other method within the class that it is defined at. Used to nullify class variables and perform necessary tear down actions necessary after all the methods in the class are executed.
  - @AfterTest: gets executed only once after every test category as defined within the .xml file. Used to nullify variables, close connections, nullify previously instantiated objects, etc. that are not needed after the test has completed its run.
- @AfterSuite: gets executed only once after everything else. Used to nullify global variables, nullify dependency connections, close any previously established global connections, etc.

Besides the annotations stated above, there are also **_@BeforeGroups_** and **_@AfterGroups_** annotations that need to be followed by '_groups_' attribute defining the name of the @Test method groups which these annotations will apply for. As their names indicate, these before and after groups annotations will be executed before methods of these groups are invoked.

