import java.util.Scanner;
public class Cars extends showroom implements Utility {

    String car_name;
    String car_color;
    String car_fuel_type;
    String car_prices;
    String car_type;
    String car_transmission;

    @Override
    public void get_details() {
        System.out.println("Car Name: " + car_name);
        System.out.println("Car Color: " + car_color);
        System.out.println("Car Fuel Type: " + car_fuel_type);
        System.out.println("Car Prices: " + car_prices);
        System.out.println("Car Type: " + car_type);
        System.out.println("Car Transmission: " + car_transmission);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car Name: ");
        car_name = sc.nextLine();

        System.out.print("Enter Car Color: ");
        car_color = sc.nextLine();

        System.out.print("Enter Car Fuel Type: ");
        car_fuel_type = sc.nextLine();

        System.out.print("Enter Car Prices: ");
        car_prices = sc.nextLine();

        System.out.print("Enter Car Type: ");
        car_type = sc.nextLine();

        System.out.print("Enter Car Transmission: ");
        car_transmission = sc.nextLine();

        total_in_Stock++;  
    }
}
