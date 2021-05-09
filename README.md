This is a demo testing framework that is meant to represent an initial state of a system level testing framework. 

**It is not meant to be used "as is"** but rather as a suggestion on the general structure a framework might have. 

In general, the framework has (currently) the following components: 

* Maven for managing the compilation and 3rd party libraries dependencies.
* Spring libraries that provides capabilities such as Dependency Injection & Rest communication (database layer can be added as well, not currently present)
* TestNG as the "test framework" that allows choosing tests, providing tests with parameters, catching assertions and managing pass\fail rates. 
* Allure framework to generate HTML reports
* Selenium for driving a browser
* A Three tiered testing structure: 
  + Atomic actions - clicking through a page or sending a REST request. 
  + Business flows - Composite actions involving multiple atomic action. These represent the business logic of the system. 
  + Tests - Scenarios, or "test cases", they are usually composed of at least one business flow
  
  
  
