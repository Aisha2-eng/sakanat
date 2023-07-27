// Package: Tests

package Tests;

import java.util.Scanner;

public class AccommodationBookingApp {

    public static void main(String[] args) {
        // Create an instance of the AccommodationManager to manage accommodations
        AccommodationManager accommodationManager = new AccommodationManager();

        // Sample accommodations for demonstration purposes
        accommodationManager.addAccommodation("Apartment 1", "Services 1", 1000.0);
        accommodationManager.addAccommodation("Villa 5", "Services 2", 2000.0);

        // Simulation of a user interacting with the application through the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Accommodation Booking App!");
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Available accommodations:");
        accommodationManager.getAccommodations().forEach(accommodation -> System.out.println(accommodation.getName()));

        System.out.println("Please select an accommodation:");
        String selectedAccommodation = scanner.nextLine();

        System.out.println("Please enter the desired dates (e.g., 2023-08-10 to 2023-08-17):");
        String dates = scanner.nextLine();

        System.out.println("Please enter the duration of your stay (e.g., 7 days):");
        String duration = scanner.nextLine();

        System.out.println("Please enter your email address:");
        String email = scanner.nextLine();

        // Now, you have the user inputs, and you can proceed with booking and confirmation logic.
        // For simplicity, we'll just print the booking details and confirmation message here.
        System.out.println("Thank you, " + name + "! You have booked " + selectedAccommodation +
                " from " + dates + " for " + duration + ".");
        System.out.println("Booking confirmed!");

        scanner.close();
    }
}
