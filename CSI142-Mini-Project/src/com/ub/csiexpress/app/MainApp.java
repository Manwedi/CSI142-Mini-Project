/**
 * MANWEDI CLAUDE 202101524
 * kgosi Temogo Totanang 202504279
 * Legofi Faith Ledimo 202504323
 * Laone Kepaletswe 202504466
 * Lebang Taukobong 202501799
 */

package com.ub.csiexpress.app;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import com.ub.csiexpress.model.Bus;
import com.ub.csiexpress.model.CityEnum;
import com.ub.csiexpress.model.Route;
import com.ub.csiexpress.contracts.Bookings;
import com.ub.csiexpress.services.FareEstimator;
import com.ub.csiexpress.exceptions.InvalidRouteException;
import com.ub.csiexpress.exceptions.OverbookedException;

public class MainApp {
    private static int choice;
    private static String name;
    private static List<Bookings> bookings = new ArrayList<>(); // this array list we will use it to store all bookings

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FareEstimator passengerFare = new FareEstimator();
        List<Bus> buses = new ArrayList<>();
        List<Route> routes = new ArrayList<>();

        System.out.println("Hello what is your name?"); // this is where we ask for the user's name
        name = scanner.nextLine();

        do { // this is the main menu
            System.out.println("\n ****************** CSI EXPRESS *****************\n");
            System.out.println("\n Welcome " + name + ", pleased to serve you at CSI Express!\n");
            System.out.println("1. BOOKINGS");
            System.out.println("2. ADMIN LOGIN");
            System.out.println("3. EXIT");
            System.out.println("\n Thank you for choosing CSI Express! \n");
            System.out.println("\n ****************** CSI EXPRESS *****************\n");

            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a number.");
                scanner.next();
                System.out.print("Enter your choice: ");
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    bookTrip(scanner, buses, routes, passengerFare);
                    break;
                case 2:
                    adminLogin(scanner, buses, routes);
                    break;
                case 3:
                    System.out.println("Thank you for choosing CSI Express!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    // this is the booking menu
    private static void bookTrip(Scanner scanner, List<Bus> buses, List<Route> routes, FareEstimator passengerFare) {
        do {
            System.out.println("\n ****************** CSI EXPRESS *****************\n");
            System.out.println("\n Welcome " + name + ", pleased to serve you at CSI Express!\n");
            System.out.println("1. BOOK A TRIP");
            System.out.println("2. CANCEL TRIP");
            System.out.println("3. VIEW MY BOOKINGS");
            System.out.println("4. BACK");
            System.out.println("\n ****************** CSI EXPRESS *****************\n");

            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a number.");
                scanner.next();
                System.out.print("Enter your choice: ");
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer, java garbage collector isn't on point(lol)

            switch (choice) {
                case 1:
                    book(scanner, buses, routes, passengerFare);
                    System.out.print("\nPress Enter to return to the menu...");
                    scanner.nextLine();
                    break;
                case 2:
                    cancelTrip(scanner);
                    System.out.print("\nPress Enter to return to the menu...");
                    scanner.nextLine();
                    break;
                case 3:
                    viewBookings();
                    System.out.print("\nPress Enter to return to the menu...");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Going back to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void book(Scanner scanner, List<Bus> buses, List<Route> routes, FareEstimator passengerFare) {
        System.out.println("\n ****************** CSI EXPRESS *****************");
        System.out.println("BOOK A TRIP ");
        System.out.println();

        CityEnum[] trip = new CityEnum[2];
        CityEnum[] allCities = CityEnum.values();

        for (int i = 0; i < allCities.length; i++) {
            System.out.println((i + 1) + ". " + allCities[i]);
        }

        int choice;
        while (true) {
            System.out.print("Enter your departure city: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice >= 1 && choice <= allCities.length) {
                    trip[0] = allCities[choice - 1];
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid choice. Try again.");
        }
        CityEnum pointA = trip[0];

        System.out.println("\nWHERE ARE YOU HEADED?");
        for (int j = 0; j < allCities.length; j++) {
            if (allCities[j] != pointA) {
                System.out.println((j + 1) + ". " + allCities[j]);
            }
        }

        while (true) {
            System.out.print("Enter your destination: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice >= 1 && choice <= allCities.length && allCities[choice - 1] != pointA) {
                    trip[1] = allCities[choice - 1];
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid choice. Try again.");
        }
        CityEnum pointB = trip[1];

        double distance = pointA.distanceTo(pointB);
        int totalFare = passengerFare.calculateFare(pointA, pointB);

        System.out.println("\nGoing to " + pointB + " awesome!");
        System.out.printf("Distance: %.1f km%n", pointA.distanceTo(pointB));
        System.out.printf("Total fare: P%d%n", totalFare);

        // NEW: Create and store booking
        String busName = "Legofi's Tour & Travel"; // Hardcoded for now - replace with bus selection
        Bookings newBooking = new Bookings(name, trip[0], trip[1], busName, totalFare);
        bookings.add(newBooking);

        System.out.println("\nBooking confirmed!");
        System.out.println(newBooking);
        System.out.println("Thank you for choosing CSI Express!\n");
    }

    private static void viewBookings() {
        System.out.println("\n ****************** CSI EXPRESS] *****************\n");
        System.out.println("YOUR BOOKINGS:\n");

        if (bookings.isEmpty()) {
            System.out.println("You have no bookings yet.");
            return;
        }

        List<Bookings> userBookings = new ArrayList<>();
        for (Bookings b : bookings) {
            if (b.getName().equals(name)) {
                userBookings.add(b);
                System.out.println(b);
            }
        }

        if (userBookings.isEmpty()) {
            System.out.println("You have no bookings yet.");
        }
    }

    private static void cancelTrip(Scanner scanner) {
        System.out.println("\n ****************** CSI EXPRESS *****************\n");
        System.out.println("CANCEL YOUR TRIP\n");

        List<Bookings> userBookings = new ArrayList<>();
        for (Bookings b : bookings) {
            if (b.getName().equals(name)) {
                userBookings.add(b);
            }
        }

        if (userBookings.isEmpty()) {
            System.out.println("You have no bookings to cancel.");
            return;
        }

        System.out.println("Your active bookings:");
        for (int i = 0; i < userBookings.size(); i++) {
            System.out.println((i + 1) + ". " + userBookings.get(i));
        }

        System.out.print("\nEnter booking number to cancel, or 0 to go back: ");
        int choice;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 0) {
                    System.out.println("Cancellation aborted.");
                    return;
                }
                if (choice >= 1 && choice <= userBookings.size()) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid choice. Try again.");
        }

        Bookings toCancel = userBookings.get(choice - 1);
        bookings.remove(toCancel); // Remove from main list
        System.out.println("\nBooking cancelled successfully:");
        System.out.println(toCancel);
        System.out.println("Refund will be processed in 3-5 business days.");
    }

    private static void adminLogin(Scanner scanner, List<Bus> buses, List<Route> routes) { // Admin method
        do {
            System.out.println("\n ****************** CSI EXPRESS *****************\n");
            System.out.println("\n ADMIN LOGIN\n");
            System.out.println("1. ADD BUS");
            System.out.println("2. BOOKINGS AND REVENUE");
            System.out.println("3. CANCEL A BOOKING");
            System.out.println("4. REMOVE BUS");
            System.out.println("5. VIEW BUSES");
            System.out.println("6. BACK");
            System.out.println("\n ****************** CSI EXPRESS *****************\n");

            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a number.");
                scanner.next();
                System.out.print("Enter your choice: ");
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    addBus(scanner, buses, routes);
                    System.out.print("\nPress Enter to return to the menu...");
                    scanner.nextLine();
                    break;
                case 2:
                    bookingRevenue(scanner);
                    System.out.print("\nPress Enter to return to the menu...");
                    scanner.nextLine();
                    break;
                case 3:
                    cancelTrip(scanner);
                    System.out.print("\nPress Enter to return to the menu...");
                    scanner.nextLine();
                    break;
                case 4:
                    removeBus(scanner, buses, routes);
                    System.out.print("\nPress Enter to return to the menu...");
                    scanner.nextLine();
                    break;
                case 5:
                    viewBuses(buses);
                    System.out.print("\nPress Enter to return to the menu...");
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

    }

    public static void addBus(Scanner scanner, List<Bus> buses, List<Route> routes) {
        System.out.println("\n ****************** CSI EXPRESS *****************\n");
        System.out.println("\n ADD BUS\n");

        System.out.print("Enter bus ID: ");
        String unitID = scanner.nextLine();
        System.out.print("Enter capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter plate number: ");
        String plateNumber = scanner.nextLine();
        System.out.print("Enter driver name: ");
        String driverName = scanner.nextLine();
        System.out.print("Enter status: ");
        String status = scanner.nextLine();
        buses.add(new Bus(unitID, capacity, plateNumber, driverName, status));
        System.out.println("\nBus added successfully!");
        System.out.println(buses);
    }

    public static void bookingRevenue(Scanner scanner) {
        System.out.println("\n ****************** CSI EXPRESS *****************\n");
        System.out.println("\n BOOKINGS AND REVENUE\n");
        System.out.println("\n BOOKINGS\n");
        System.out.println(bookings);
        System.out.println("\n REVENUE\n");
        double totalRevenue = 0;
        for (Bookings b : bookings) {
            totalRevenue += b.getFare();
        }
        System.out.println(totalRevenue);

    }

    public static void removeBus(Scanner scanner, List<Bus> buses, List<Route> routes) {
        System.out.println("\n ****************** CSI EXPRESS *****************\n");
        System.out.println("\n REMOVE BUS\n");
        System.out.println(buses);
        System.out.print("Enter bus ID to remove: ");
        String unitID = scanner.nextLine();
        buses.removeIf(bus -> bus.getUnitID().equals(unitID));
        System.out.println("\nBus removed successfully!");
        System.out.println(buses);
    }

    public static void viewBuses(List<Bus> buses) {
        System.out.println("\n ****************** CSI EXPRESS *****************\n");
        System.out.println("\n VIEW BUSES\n");
        System.out.println(buses);
    }
}
