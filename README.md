# Chat application api 
## Frameworks and language used:
-  Spring Boot
-  Java
- SQL database
## Data Flow


* **Model** :
  There are Three Model class in this application.
    1. User Model Class.
    2. Status Model Class.
    3. ChatHistory Model Class.

* **Controller** :

  There are Three Controller class in this application.

    1. User Controller Class.
    2. Status Controller Class.
    3. ChatHistory Controller Class.


**Functions/Endpoints used in User Controller Class.**
- To add User data :
- http://localhost:8080/api/v1/user/create-user


- To get all User's information:
- http://localhost:8080/api/v1/user/getAllUsers


- To update User's details:
- http://localhost:8080/api/v1/user/get-users


- To delete User by id:
- http://localhost:8080/api/v1/user/delete-user/{userId}


- To login user:
- http://localhost:8080/api/v1/user/login


- To update User:
- http://localhost:8080/api/v1/user/update-user/{userId}


**Functions/Endpoints used in Status Controller Class.**

- To add Staus:
- http://localhost:8080/api/v1/status/create-status


**Functions/Endpoints used in ChatHistory Controller Class.**

- To Send message:
- http://localhost:8080/api/v1/chat/send-message


* **Service** :

    * In this application there are Three service class .
        * User Service Class
        * Staus Service Class
        * ChatHistory Service Class


* **Repository**

    * In this application there Four Repository class.
        * UserRepository
        * StausRepository
        * ChatHistoryRepository 

* **Database**

    * I have used SQL Database to store the data.

## Project Summary

In this application by using various RestApi we can add User, we can associate multiple
chat to a perticular User.
We can add multiple Chat and can perform CRUD operations.
We can validate all details of User like email, phone_number, password etc.
we fetch various data using different ewndpoints.
We can visualize data on SQL workbench.

