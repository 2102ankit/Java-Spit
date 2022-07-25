# Java-Spit
In this Repository my Java Practice Programs from College as well as Tutorials are uploaded 
<br />

Experiment-2
Program-1: Write a class Book with title for the title of book of type String, author for the author’s name of type String, and price for the book price of type double. Using constructor define the values for data members.
Create another class BookDemo with a main() method, which creates a Book titled “Developing Java Software” with authors Russel Winder and price $79.75.
Prints the Book’s string representation to standard output (using System.out.println).

Program-2 :- Write a class ‘Student’ with the following specifications:
Data Members:
- String studName : Name of student
- String sid : Unique ID of the student
- percentage : Percentage of student (Choose appropriate data-type)
Create a constructor to define the values for these data members. Take multiple inputs from user and print the students information with an appropriate grade (A,B,C,D).
<br />

Experiment No. 03

Program-1:- Create a Date class with data int year, int month, int date,  int hrs, int min, int sec. Create a default, no-argument constructor which sets the default date to January 1, 2000, 00:00:00 Create 3 overloaded setter methods 
void setDate(int year, int month, int date)
void setDate(int year, int month, int date, int hrs, int min)
void setDate(int year, int month, int date, int hrs, int min, int sec)
Also write a displayDate() method which will display the date depending on the type of date object created.

Program-2:- Write a menu-driven program to recruit an employee (depending on his performance in various rounds) in some software company using constructor overloading.
Selection Criteria for each post is given below:
i) Programmer (Minimum total of 80 marks):-
Rounds:-
(1) Course Work
(2) Aptitude Test
(3) Technical Test
(4) Interview

ii) Team Leader (Minimum total of 85 marks ):-
Rounds:-
(1) Technical Test
(2) Interview

iii) Project Manager (Minimum score 90 marks)
Rounds:-
(1) Interview

Create a class Posting and write 3 constructors to initialize the object and set the parameters
and display the employee post according to selection criteria.
Data members:
● int courseWork;
● int AptTest;
● int TechTest;
● int interview;
Methods:
● Posting (int courseWork, int AptTest, int TechTest,int interview)
● Posting (int TechTest,int interview)
● Posting (int interview)
Make use of ‘this’ keyword.
<br />

Experiment-4
Program-1:- Write a program in Java to maintain the information of Movies which includes the information of name of movie , type of movie( action , thriller , comedy ,drama ) , Hero name , Heroine , budget in Rs. . Write a program to accept the information of movies from user and sort them according to the budget of the film

Program-2:- Write an editor program in java which can
1. take paragraph as input.
2. find number of occurance of a word
3. find and deletes a word
4. finds and replaces a word.
5.  Program on Inheritance: Implement a Program to demonstrate single, multilevel Inheritance
<br />

Experiment-5
Program 1:- Define parent class "Employee" that has 3 private attributes String name, String id, int age.
Employee has constructor with 3 arguments that set value of name, id, age. It also has getter and setter methods for all 3 private attributes.
Class "SalariedEmployee" is a sub class of Employee and has 1 private attribute empSalary. "SalariedEmployee" can be permanent or on contract and has constructor SalariedEmployee(String name, String id, int age, double empSalary) to set the values.
constructor SalariedEmployee must call the superclass constructor to set name, id, age and call setter method to set the salary.
Employee salary is empSalary + 2000(allowance) if he is a permanent employee else Employee salary is empSalary (no allowance).
Accept the details of 5 employees and print details of the employee with highest salary.
Create class Tester with main method

Program 2:- Define class Production that has attributes String title, String director, String writer. Production class has 3 argument constructor that sets the values. It also has getter and setter methods and Overridden toString() of object class  to display details of class.
class Play is a sub-class of Production with getter and setter methods and has an attribute int performances that is incremented every time a play happens. Add Overridden toString() of the object class to display details of class
class Musical is a Play with songs. Musical object has all attributes of Play as well as String composer and String lyricist along with getter and setter methods. Override toString display all attributes of the Musical object
In main create 3 objects of Play and 2 objects of Musical. Every time an object of Play or Musical is created, performances get incremented.  Also add the number of seats booked for each play or musical.
Find the total box office collection, provided the cost of 1 seat for Play is Rs 500(can be variable) and the cost of 1 seat for Musical is Rs 800(can be variable)
Display the total No. of performances as 5 and display the box office collection.
Create a class Tester with the main method
<br />
Experiment-6
Program 1:-  Consider a scenario where Bank is a class that provides functionality to get the rate of interest. However, the rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks are given below.
SBI  Interest Rate (Rates in % per annum)
  if <07 Days 2.00
    7–14 Days 3.00
   15–30 Days 3.00
   31-45 Days 3.00
  46 -90 Days 4.05
  91–120 Days 4.10
121-180 Days  4.10

ICICI  Interest Rate (Rates in % per annum)
if <07 Days 2.00
    7–14 Days 3.10
   15–30 Days 3.20
   31-45 Days 3.50
  46 -90 Days 4.50
  91–120 Days 4.70
121-180 Days  4.90

AXIS Interest Rate (Rates in % per annum)
ICICI  Interest Rate (Rates in % per annum)
if <07 Days 2.00
    7–14 Days 3.15
   15–30 Days 3.15
   31-45 Days 3.45
  46 -90 Days 4.05
  91–120 Days 4.70
121-180 Days  5.00

Aayush has deposited Rs. 10000 in SBI Bank,  Rs. 12500 in ICICI Bank, and Rs. 20000 in AXIS bank respectively for a particular month.
You need to print the money he will get by applying the rate of interest as per the bank and days.
Create a class 'Bank' with a method 'get_rate_of_interest' which returns 2%.
Make three subclasses named  SBI_Bank, ‘ICICI_Bank’ and 'AXIS_bank' with a method with the same name 'get_rate_of_interest' which returns the rate of interest.
Also, give the final amount Ayush will get from that particular bank by applying the rate of interest and period. Use Calendar Class to count the number of days and amount he will get after maturity with the date of Maturity, if he deposits today.
Note:
1.  Use compound interest
2. Get time period from the user
3. Solve using method overriding

Program 2:- Ankit works at ABC Company. He noticed that different roles(positions) have different salaries and bonuses. The 1st Role is an ‘Intern’ which has 3/4th of the base salary of an Employee.  Then there is ‘Clerk’ which has ½ of base salary. And then there are ‘Manager’ who have twice the base salary of that of an employee. Help him write a program in Java as follows.
Create a class ‘Employee’ which has a method named ‘getSalary’ which returns a base salary of Rs. 10,000. It also has methods named ‘getBonus’ which returns the bonus amount for that role(initially set to Rs. 0). 
Make 3 subclasses for different roles which inherit the ‘Employee’ class and each has functions named ‘getSalary’ and ‘getBonus’.(You can assume values for ‘getBonus’ method)
Display the output for all cases. Also print the total salary received by each Employee after getting the bonus.
Note : Solve using method overriding
<br />
Experiment-7
Program-1:- Write an abstract class Course with an abstract method studentDetails().
Create 2 classes Comps and IT which inherits class Course and implements studentDetails().
The studentDetails() method should print the name, UID, and year (FE, SE, TE) of students of that Course. These details have to be taken from the user.
Write a program that asks the user to choose a Course and prints details of all students in that course in a sorted manner as per the year(FE, SE, TE).

Program-2:- Write a program to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. 
Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. 
The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
Input to be taken from the user. Display the marks in highest order of student A and B.
<br />
Experiment-8
Program-1:-
Part A
Consider two interfaces, Volume and SurfaceArea with methods getVolume() and getSurfaceArea() respectively. Class ‘Cylinder’ implements both Volume and SurfaceArea and implements their methods. The class contains their required dimensions as data members.
Write a program which inputs its dimensions and prints its volume and surface area.

Part B
A banking system has two interfaces SavingAccount and CurrentAccount. The SavingAccount account has method getSimpleInterest() and CurrentAccont has method getCompoudInterest(). Both these interfaces are implemented by class Customer. Customer have data members: account type, interest rate, time and balance. The class then calculates interest on balance and prints it.

Program-2:-
A fast food centre has two interfaces EatItHere and TakeAway. They have methods like EatItHere have deliverOrder() and TakeAway have dispatchOrder(). The class Consumer inherits both of them. If Consumer orders a takeaway hen will be charged a convenience fee of Rs. 45/- or 5% of order price whichever is more. If he chooses to eat in a restaurant then he will be charged Rs. 500/- service charge or 10% of order price whichever is lower.  The class consumer has data members as order number and order price.
<br />
Experiment No. 9
Program 1
There is an abstract class Account
Attribute:- Name,Balance, Acc_No
Method:-Deposit - abstract method, withdraw - abstract method, display - abstract method

Saving Account inherits the Account class and provides the implementation for the methods accordingly
Saving Account class Attribute:- interestRate, minBalance,
Method:- addInterest(): handle Arithmetic Exception, transfer():

Note:
● Balance cannot be less than 0.
● In a Saving account if minBalance is set then for that the balance cannot go less than that amount. If it goes, an error must be shown.
● let the user deposit to or withdraw from the account. For each transaction, a message is displayed to indicate the status of thetransaction: successful or failed. In case of failure, the failure reason is reported.
● The possible Exceptions are negative-amount-exception (in both deposit and withdraw transaction) and insufficient-amount- exception ( in withdraw transaction).

For the above scenario write an interactive program in Java. Also, show output for different use cases

Program 2
Write a program to accept distance between two vaccine dose as input from user. If the user enters <84 days  as an input or if user enters any negative number, or >100  user defined exception should be generated

<br />

Experiment 10
Program1
Define two different classes namely, Student and Employee. These classes are derived from a base class Person. 
Define other two classes Staff and Faculty. Staff and Faculty classes are derived from Employee class. 

The Person class has name and age data and display method to display the name and age of a person. The Student class has data like rollNo and branch and display method to display name, age, rollNo and branch of the student. Employee has ecNo and doj(date of joining) data and display method to display name, age, ecNo, doj of the stuff. Faculty has designation data (Assistant Professor, Associate Professor and Professor) and display method to display the name, age, ecNo, doj and designation of the Faculty. Staff has designation data (Technical and Clerical) and display method to display the name, age, ecNo, doj and designation of the Staff. Each class have their own constructor to initialize the value of each data field. Finally create MainDemoClass and create an object of each class. 

The main class calls, all other class as API. Print the values of all objects in the MainDemoClass

Program 2
Create a GST class in package myPackage, that calculates the tax for a product. The class has rate of interest defined based on type of GST and has calculateGST(type, amount)
There are four different types of GST as listed below:
The Central Goods and Services Tax (CGST) - Rate 5%
The State Goods and Services Tax (SGST) -Rate 10%
The Union Territory Goods and Services Tax (UTGST) -Rate 12%
The Integrated Goods and Services Tax (IGST) - Rate 15%

Create Driver class not in myPackage with main function to calculate the GST of a product input by the user.

Display the GST amount
