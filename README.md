# Preamble

Build and Execute App
* This application uses an in memory H2 database.

Access http://localhost:8080/users/all (referred to as All end point)
* Data provided for 10 users

Access http://localhost:8080/users/fetch/1 (referred to as Fetch end point)
* Data provided for user no 1

Access http://localhost:8080/h2-console/
* Ensure Generic H2 Embedded is selected
* Ensure Driver is: org.h2.Driver
* Ensure JDBC URL is: jdbc:h2:mem:testdb
* Ensure User Name is sa and password is blank

Execute SELECT * FROM CANDIDATES.ADDRESS 
* Result 5 rows

# Task
* The following API https://jsonplaceholder.typicode.com/ has CRUD end points for something called 'Posts'
* Each time the Fetch end point of this service is invoked - it should also provide the 'Posts Object' for the specified Id
* The Fetch end point should access the H2 database first, and where not found, retrieved the 'Posts' from the API 

This can be broken down in to steps
1. Add 'Posts Object' to the Fetch end point response. 
	* running a test should show null posts for Fetch end point
2. Modify persistence layer to be able to persist 'Posts Object' records
	* no testable change 
3. Add some Post data to H2
	* running a test should show posts for data in H2 and null for other.
4. Modify Fetch end point to retrieve 'Posts Object' from H2
	* running a test should show null posts as there is no data
5. Modify Fetch end point to retrieve 'Posts Object' from API if not in H2
	* running a test should show posts for data in H2 and from API.
6. Modify Fetch end point to persist 'Posts Object' in to H2
	* Using H2 console we should see Posts

