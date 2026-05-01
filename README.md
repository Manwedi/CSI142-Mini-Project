#GROUP MEMBERS
 * MANWEDI CLAUDE 202101524 <br>
 * kgosi Temogo Totanang 202504279 <br>
 * Legofi Faith Ledimo 202504323 <br>
 * Laone Kepaletswe 202504466 <br>
 * Lebang Taukobong 202501799 <br> 

# THEME: TRANSPORT AND MOBILITY
## PROBLEM STATEMENT
Public transport providers in Gaborone often struggle to effectively manage their fleets consisting of both high-capacity buses and mini buses. Moreover, they at times overcharges customers and
poorly manage customer bookings. CSI EXPRESS Fleet Manager addresses this problem by providing a digital console for conductors to calculate fares based on distance. It basically ensures correct charging of customers along as well an non exceeding of the legal bus capacity.

This project is done inorder to help the bus managers to keep record of the bookings done
As for the normal users they use this program to book their tours from one place to another 
which also helps them calculate the distance and travel cost so that they make informed decisions.

PACKAGE STRUCTURE

src/ <br>
└── com/ <br>
    └── ub/ <br>
        └── csiexpress/ <br>
            ├── app/ <br>
            │   └── MainApp.java           (Entry point) <br>
            ├── contracts/ <br>
            │   └── Bookings.java          (Interface for bookings) <br>
            ├── model/ <br>
            │   ├── Bus.java               (Inherits from TransportUnit) <br>
            │   ├── CityEnum.java          (Enum for locations) <br>
            │   ├── Combi.java             (Inherits from TransportUnit) <br>
            │   ├── Route.java             (Route data) <br>
            │   └── TransportUnit.java     (Parent/Abstract class) <br>
            ├── services/ <br>
            │   └── FaresEstimator.java    (Business logic) <br>
            └── util/ <br>
                └── InputValidator.java    (Helper method) <br>
                
* src/com/ub/csiexpress/app/MainApp.java <br>
* src/com/ub/csiexpress/contracts/Bookings.java <br>
* src/com/ub/csiexpress/model/Bus.java <br>
* src/com/ub/csiexpress/model/Combi.java <br>
* src/com/ub/csiexpress/model/CityEnum.java <br>
* src/com/ub/csiexpress/model/Route.java <br>
* src/com/ub/csiexpress/model/TransportUnit.java <br>
* src/com/ub/csiexpress/services/FaresEstimator.java <br>
* src/com/ub/csiexpress/util/InputValidator.java <br>
