There are two test runners under test 
1. TestFizzBuzz class will run the tests with test data given in the Data Provider
2. TestFizzBuzzWithFile class runs the tests with test data given in JSON file under resources. Test data is loaded into data provider.

Since its under maven all we have to do is Execute "mvn test" to run all the tests
or mvn test -Dtest=Aisera.Task1.TestFizzBuzz for targeted tests
