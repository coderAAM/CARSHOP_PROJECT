import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements Utility {
    String employee_name;
    String employee_email;
    String employee_phone;
    String employee_address;
    String employee_salary;
    String employee_experience;
    String employee_id;
    String employee_password;
    String employee_type;
    String employee_status;

    @Override
    public void get_details() {
        System.out.println("Employee Name: " + employee_name);
        System.out.println("Employee Email: " + employee_email);
        System.out.println("Employee Phone: " + employee_phone);
        System.out.println("Employee Address: " + employee_address);
        System.out.println("Employee Salary: " + employee_salary);
        System.out.println("Employee Experience: " + employee_experience);
        System.out.println("Employee ID: " + employee_id);
        System.out.println("Employee Password: " + employee_password);
        System.out.println("Employee Type: " + employee_type);
        System.out.println("Employee Status: " + employee_status);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================***ENTER EMPLOYEE DETAILS***==========================================");

        System.out.print("Enter Employee Name: ");
        employee_name = sc.nextLine();

        System.out.print("Enter Employee Email: ");
        employee_email = sc.nextLine();

        System.out.print("Enter Employee Phone: ");
        employee_phone = sc.nextLine();

        System.out.print("Enter Employee Address: ");
        employee_address = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        employee_salary = sc.nextLine();

        System.out.print("Enter Employee Experience (in years): ");
        employee_experience = sc.nextLine();

        
        employee_id = UUID.randomUUID().toString();
        System.out.println("Generated Employee ID: " + employee_id);

        System.out.print("Enter Employee Password: ");
        employee_password = sc.nextLine();

        System.out.print("Enter Employee Type (e.g., Manager, Staff): ");
        employee_type = sc.nextLine();

        System.out.print("Enter Employee Status (e.g., Active, Inactive): ");
        employee_status = sc.nextLine();
    }
}
