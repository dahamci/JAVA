
import java.util.Scanner;
public class AS20240957 {
    static Scanner sc = new Scanner(System.in);
    static String[] cities = new String[10];
    static int cityCount = 0;


    public static void main(String[] args){
        int choice = -1;
        while (choice != 0) {
            System.out.println("\n===== LOGISTICS SYSTEM MENU =====");
            System.out.println("1. City Management");
            System.out.println("2. Distance Management");
            System.out.println("3. New Delivery Request");
            System.out.println("4. Reports");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear newline

            if (choice == 1) cityManagement();
            else if (choice == 2) System.out.println("Distance Management selected");
            else if (choice == 3) System.out.println("New Delivery selected");
            else if (choice == 4) System.out.println("Reports selected");
            else if (choice == 0) System.out.println("Exiting...");
            else System.out.println("Invalid choice, try again.");
        }


    }

    // City management menu
    public static void cityManagement() {
        int choice = -1;
        while (choice != 0) {
            System.out.println("\n--- CITY MANAGEMENT ---");
            System.out.println("1. Add City");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) addCity();
        }
    }

    // Add city
    public static void addCity() {
        if (cityCount == 10) {
            System.out.println("City list is full.");
            return;
        }
        System.out.print("Enter city name: ");
        String name = sc.nextLine();
        cities[cityCount] = name;
        cityCount++;
        System.out.println("City added successfully.");
    }

}
