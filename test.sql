-----------------insert

Hibernate: select max(id) from Lecturer
Hibernate: insert into Lecturer (fname, lname, id) values (?, ?, ?)
The lecturer [ ID = 36, firstName = Ahmed , firstName = Ibrahim ] is successfully added to your database

-----------------update

Hibernate: select lecturer0_.id as id0_0_, lecturer0_.fname as fname0_0_, lecturer0_.lname as lname0_0_ from Lecturer lecturer0_ where lecturer0_.id=?
The lecturer [ ID = 4, firstName = Nada , firstName = Ibrahim ] is successfully updated to your database

-----------------delete

Hibernate: select lecturer0_.id as id0_0_, lecturer0_.fname as fname0_0_, lecturer0_.lname as lname0_0_ from Lecturer lecturer0_ where lecturer0_.id=?
The lecturer [ ID = 20, firstName = null , firstName = null ] is successfully deleted from your database

----------------select all

Hibernate: select lecturer0_.id as id0_, lecturer0_.fname as fname0_, lecturer0_.lname as lname0_ from Lecturer lecturer0_ order by fname, lname
The lecturer [ ID = 1, firstName = Fatma , firstName = Meawad ] is successfully retrieved from your database
The lecturer [ ID = 10, firstName = Hana , firstName = Ibrahim ] is successfully retrieved from your database
The lecturer [ ID = 27, firstName = John , firstName = Paul ] is successfully retrieved from your database
The lecturer [ ID = 4, firstName = Nada , firstName = Ibrahim ] is successfully retrieved from your database

------------------select one

Hibernate: select lecturer0_.id as id0_0_, lecturer0_.fname as fname0_0_, lecturer0_.lname as lname0_0_ from Lecturer lecturer0_ where lecturer0_.id=?
The lecturer [ ID = 1, firstName = Fatma , firstName = Meawad ] is successfully retrieved from your database

-------------------------------------------