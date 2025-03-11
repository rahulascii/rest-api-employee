# rest-api-employee


H2 console URL
-------------------

http://localhost:8080/h2-console/

POST Request- to save Employee Detaiils
-----------------------------------------
URL : localhost:8080/

Sample payload data

{
  "name": "jsjfn",
  "address": "del, ind",
  "isActive": true
}

Sample Response

{
    "id": 1553,
    "name": "jsjfn",
    "address": "del, ind",
    "isActive": true
}

Get Request - To get all Employee Details
-------------------------------------------

URL : localhost:8080/employees

Get Request - To get Employee Details by Id
----------------------------------------------

URL : localhost:8080/employees/2

Delete Request - To Delete Employee Details by Id
----------------------------------------------

URL: localhost:8080/employees/3

PUT Request - To Update Employee Details by Id
----------------------------------------------
localhost:8080/employees/2

Sample Payload
{
  "name": "Kim Bailey Updated",
  "address": "NewYork , London Updated",
  "isActive": false
}

Sample Response

{
    "id": 2,
    "name": "Kim Bailey Updated",
    "address": "NewYork , London Updated",
    "isActive": false
}