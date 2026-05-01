# CSI EXPRESS FLEET MANAGER APP DOCUMENTATION

## GROUP MEMBERS
 * MANWEDI CLAUDE 202101524 <br>
 * kgosi Temogo Totanang 202504279 <br>
 * Legofi Faith Ledimo 202504323 <br>
 * Laone Kepaletswe 202504466 <br>
 * Lebang Taukobong 202501799 <br>  
 
## ACADEMIC CONTEXT
This project was developed as part of the Computer Science program at the University of Botswana.
Course: CSI 142 (OBJECT ORIENTED PROGRAMMING
Instructor: DR KOMBE

## FEATURES

Admin Features
* Add/Remove Vehicles: Manage the fleet by adding or removing Buses and Combis.
* View Fleet: Monitor available transport units and their statuses.
* Revenue Tracking: View total bookings and generated revenue.
* Booking Management: Cancel or modify existing trips.

Passenger Features:
* Book a Trip
* Cancel a Trip
* View My Bookings

## GETTING STARTED
### Prerequisites
* Java 21 or higher
* Git client

## COMPILING AND RUNNING
1. Clone the repository onto a local directory: (git clone https://github.com/Manwedi/CSI142-Mini-Project.git)
2. Open a terminal or command prompt in the project directory: cd CSI142-Mini-Project/src
3. Compile the project: javac -d bin src/com/ub/csiexpress/app/*.java src/com/ub/csiexpress/contracts/*.java src/com/ub/csiexpress/model/*.java src/com/ub/csiexpress/services/*.java src/com/ub/csiexpress/util/*.java
4. Run the project: java -cp bin com.ub.csiexpress.app.MainApp

## TECHNICAL STACKS AND OBJECTS
Programming Language: Java
Architecture: Object Oriented Programming(Inheritance, Polymorphism, Abstraction, Encapsulation, Enums, Interfaces)

## Contributing
Always `git pull origin main` before starting work to avoid merge conflicts.
Create a feature branch for significant changes.

## RUNNING MAIN APP
To run the main app, navigate to the `src` directory in your terminal and run the following command:
java com.ub.csiexpress.app.MainApp

### Home Screen 
******** CSI EXPRESS ******** <br>
Welcome Manwedi, pleased to serve you at CSI Express! <br>

1. BOOKINGS <br>
2. ADMIN LOGIN <br>
3. EXIT <br>

Thank you for choosing CSI Express!
*****************************

### Bookings Screen
******** CSI EXPRESS ******** <br>
Hello Claude, pleased to serve you at CSI Express! <br>
1. Book a Trip --> <br>
2. Cancel Trip --> <br>
3. View My Bookings --> <br>
4. Back <br>
****************************

### Admin Screen
* Admin Credentials: <br>
    Username: "admin" <br>
    Password: "admin123" <br>    // we added ignoreCase to the login method because it is just a demo and we were reducing code complexity to not overcomplicate the project...

Admin Login --> Enter password --> Admin Dashboard  
 ****************** CSI EXPRESS ***************** <br>
Hello Admin, enter your credentials to continue <br>
Enter your username <br>
//admin <br>
Enter your password <br>
//admin123 <br>

#### After Succesful login // Admin Portal
 ****************** CSI EXPRESS *****************
 ADMIN LOGIN
1. ADD BUS
2. BOOKINGS AND REVENUE
3. CANCEL A BOOKING
4. REMOVE BUS
5. VIEW BUSES
6. BACK <br>
 ****************** CSI EXPRESS ***************** <br>
