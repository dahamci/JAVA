
import java.util.Scanner;
public class AS20240957 {
    static Scanner sc = new Scanner(System.in);

    static int[][] distance = new int[10][10];

    static String[] cities = new String[10];
    static int cityCount = 0;

    static String[] fromCity = new String[20];
    static String[] toCity = new String[20];
    static String[] vehicleType = new String[20];
    static int[] distanceUsed = new int[20];
    static int[] weight = new int[20];
    static double[] baseCost = new double[20];
    static double[] fuelUsed = new double[20];
    static double[] fuelCost = new double[20];
    static double[] totalCost = new double[20];
    static double[] profit = new double[20];
    static double[] customerCharge = new double[20];
    static double[] timeTaken = new double[20];
    static int deliveryCount = 0;



    static String[] vehicles = {"Van", "Truck", "Lorry"};
    static int[] capacity = {1000, 5000, 10000};
    static int[] rate = {30, 40, 80};
    static int[] speed = {60, 50, 45};
    static int[] efficiency = {12, 6, 4};
    static double fuelPrice = 310.0;



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
            System.out.println("2. List Cities");
            System.out.println("3. Rename City");
            System.out.println("4. Remove City");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) addCity();
            else if (choice == 2) listCities();
            else if (choice == 3) renameCity();
            else if (choice == 4) removeCity();
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

    public static void listCities() {
        System.out.println("\n--- CITY LIST ---");
        for (int i = 0; i < cityCount; i++) {
            System.out.println(i + " - " + cities[i]);
        }
        if (cityCount == 0) System.out.println("No cities yet.");
    }

    public static void renameCity() {
        listCities();
        System.out.print("Enter city number to rename: ");
        int index = sc.nextInt();
        sc.nextLine();
        if (index >= 0 && index < cityCount) {
            System.out.print("Enter new name: ");
            String newName = sc.nextLine();
            cities[index] = newName;
            System.out.println("City renamed.");
        } else {
            System.out.println("Invalid city index.");
        }
    }

    public static void removeCity() {
        listCities();
        System.out.print("Enter city number to remove: ");
        int index = sc.nextInt();
        sc.nextLine();
        if (index >= 0 && index < cityCount) {
            for (int i = index; i < cityCount - 1; i++) {
                cities[i] = cities[i + 1];
            }
            cityCount--;
            System.out.println("City removed.");
        } else {
            System.out.println("Invalid city number.");
        }
    }

    public static void distanceManagement() {
        listCities();
        if (cityCount < 2) {
            System.out.println("Need at least 2 cities.");
            return;
        }

        System.out.print("Enter city 1 number: ");
        int a = sc.nextInt();
        System.out.print("Enter city 2 number: ");
        int b = sc.nextInt();
        System.out.print("Enter distance in km: ");
        int d = sc.nextInt();
        sc.nextLine();

        if (a >= 0 && b >= 0 && a < cityCount && b < cityCount && a != b) {
            distance[a][b] = d;
            distance[b][a] = d;
            System.out.println("Distance saved!");
        } else {
            System.out.println("Invalid entries.");
        }
    }

    public static void newDelivery() {
        if (cityCount < 2) {
            System.out.println("Add at least 2 cities first.");
            return;
        }
        listCities();
        System.out.print("Enter source city number: ");
        int s = sc.nextInt();
        System.out.print("Enter destination city number: ");
        int d = sc.nextInt();
        System.out.print("Enter distance (km): ");
        int dist = sc.nextInt();
        System.out.print("Enter package weight (kg): ");
        int w = sc.nextInt();

        System.out.println("Select vehicle:");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println((i + 1) + ". " + vehicles[i]);
        }
        int v = sc.nextInt() - 1;

        System.out.println("Delivery created!");
    }






}
