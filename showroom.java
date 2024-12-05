import java.util.Scanner;


public class showroom implements Utility {
    String showroom_name;
    String showroom_location;
    int total_Employees;
    int total_in_Stock;
    String manager_name;

    @Override
    public void get_details() {
        System.out.println("Showroom Name: " + showroom_name);
        System.out.println("Showroom Location: " + showroom_location);
        System.out.println("Total Number of Employees: " + total_Employees);
        System.out.println("Manager Name: " + manager_name);
        System.out.println("Total Number of Items in Stock: " + total_in_Stock);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Showroom Name: ");
        showroom_name = sc.nextLine();

        System.out.print("Enter Showroom Location: ");
        showroom_location = sc.nextLine();

        System.out.print("Enter Total Number of Employees: ");
        total_Employees = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Manager Name: ");
        manager_name = sc.nextLine();

        System.out.print("Enter Total Number of Items in Stock: ");
        total_in_Stock = sc.nextInt();
    }
}
