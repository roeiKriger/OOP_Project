# OOP_Project
Academic project in Java course (OOP). 
Includes: inheritance, interfaces, data structures, exceptions, Enums, singleton, serialization, JavaFx.
The singleton class (which contains most of the code) is ZOO.

The project is an information system for a zoo with consideration to Covid-19 limitations.
The zoo is divided to sections, in each of the sections the system keeps track of the number of visitors so they will not overpass the limit of visitros for the section.
Moreover, the system database contains: animals. visitors, employees, drinks and food. All of the data is being saved to a serialized file.
If there is any case of a user error, or a Covid-19 limitation that the employees in the zoo need to know about then the system will pop up an exception/message with details about the problem.
The system contains screens for the zoo manager and for the employees of the zoo. 
The manager has access to all of the screens, can update, delete and add data to the zoo database.
The employee has a limited access and can see only part of the screens.
Only employees and managers can use the system, they have username, password and need to log in before they can do any action.
The manager has screens in which he can see details about the sections, animals and more. He can decide to change the way the data is shown to him (in a screen that simulates for him a database table), for example: see first the sections with the highest profit, or to order by name. Also some of the data can have a secondry sort.
In addition, some of the details about the zoo is shown as charts, in order to make it easier for the users to keep track (for example) about the statictics of the cafeteria.
The design (CSS) is mostly the same for all of the screens unless there is a specific need for a special screen to be different.
