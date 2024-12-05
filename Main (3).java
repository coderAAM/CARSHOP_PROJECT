import java.util.Scanner;

interface Utility {
    void get_details();

    void set_details();
}

class Showroom implements Utility {
    private String name;
    private String location;

    @Override
    public void get_details() {
        System.out.println("Showroom Name: " + name);
        System.out.println("Location: " + location);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Showroom Name: ");
        name = sc.nextLine();
        System.out.print("Enter Showroom Location: ");
        location = sc.nextLine();
    }
}

class Employee implements Utility {
    private String name;
    private int id;

    @Override
    public void get_details() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
    }
}

class Car implements Utility {
    private String model;
    private String brand;

    @Override
    public void get_details() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Brand: " + brand);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Car Model: ");
        model = sc.nextLine();
        System.out.print("Enter Car Brand: ");
        brand = sc.nextLine();
    }
}

public class Main {
    static void main_menu() {
        System.out.println("==============================****ENTER YOUR CHOICE****==============================");
        System.out.println("1. Add SHOWROOM");
        System.out.println("2. Add EMPLOYEE");
        System.out.println("3. Add CAR");
        System.out.println("4. GET SHOWROOMS");
        System.out.println("5. GET EMPLOYEES");
        System.out.println("6. GET CARS");
        System.out.println("0. EXIT");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom[] showrooms = new Showroom[5];
        Employee[] employees = new Employee[5];
        Car[] cars = new Car[5];

        int showroomCount = 0, employeeCount = 0, carCount = 0, choice;

        do {
            main_menu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (showroomCount < 5) {
                        showrooms[showroomCount] = new Showroom();
                        showrooms[showroomCount].set_details();
                        showroomCount++;
                    } else {
                        System.out.println("Showroom list is full.");
                    }
                    break;

                case 2:
                    if (employeeCount < 5) {
                        employees[employeeCount] = new Employee();
                        employees[employeeCount].set_details();
                        employeeCount++;
                    } else {
                        System.out.println("Employee list is full.");
                    }
                    break;

                case 3:
                    if (carCount < 5) {
                        cars[carCount] = new Car();
                        cars[carCount].set_details();
                        carCount++;
                    } else {
                        System.out.println("Car list is full.");
                    }
                    break;

                case 4:
                    if (showroomCount == 0) {
                        System.out.println("No showrooms available.");
                    } else {
                        for (int i = 0; i < showroomCount; i++) {
                            showrooms[i].get_details();
                        }
                    }
                    break;

                case 5:
                    if (employeeCount == 0) {
                        System.out.println("No employees available.");
                    } else {
                        for (int i = 0; i < employeeCount; i++) {
                            employees[i].get_details();
                        }
                    }
                    break;

                case 6:
                    if (carCount == 0) {
                        System.out.println("No cars available.");
                    } else {
                        for (int i = 0; i < carCount; i++) {
                            cars[i].get_details();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while (choice != 0);
    }
}
