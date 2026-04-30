# CSI EXPRESS FLEET MANAGER APP DOCUMENTATION

## GROUP MEMBERS
KGOSI THEMOGO TOTANANG 202504279
LEGOFI FAITH LEDIMO 202504323
LAONE KEPALETSWE 202504466
LEBANG TAUKOBONG 202501799
MANWEDI CLAUDE 202101524

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
******** CSI EXPRESS ********
Welcome Manwedi, pleased to serve you at CSI Express!

1. BOOKINGS
2. ADMIN LOGIN 
3. EXIT

Thank you for choosing CSI Express!
*****************************

### Bookings Screen
******** CSI EXPRESS ********
Hello Claude, pleased to serve you at CSI Express!  
1. Book a Trip --> 
2. Cancel Trip --> 
3. View My Bookings --> 
4. Back
****************************

### Admin Screen
* Admin Credentials: 
    Username: "admin"  
    Password: "admin123"    // we added ignoreCase to the login method because it is just a demo and we were reducing code complexity to not overcomplicate the project...

Admin Login --> Enter password --> Admin Dashboard  
 ****************** CSI EXPRESS *****************
Hello Admin, enter your credentials to continue
Enter your username
//admin
Enter your password
//admin123

#### After Succesful login // Admin Portal
 ****************** CSI EXPRESS *****************
 ADMIN LOGIN
1. ADD BUS
2. BOOKINGS AND REVENUE
3. CANCEL A BOOKING
4. REMOVE BUS
5. VIEW BUSES
6. BACK
 ****************** CSI EXPRESS *****************
