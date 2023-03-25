import java.util.Scanner;
/**
 * вы можете создать экземпляр определенного типа телефона на основе пользовательского ввода, а затем использовать его для совершения вызова
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter phone type (1 for stationary, 2 for mobile): ");
        int phoneType = scanner.nextInt();
        scanner.nextLine();

        Phone phone;
        if (phoneType == 1) {
            phone = new StationaryPhone(phoneNumber);
        } else {
            System.out.print("Enter phone brand: ");
            String brand = scanner.nextLine();
            System.out.print("Enter phone model: ");
            String model = scanner.nextLine();
            phone = new MobilePhone(phoneNumber, brand, model);
        }

        System.out.print("Enter number to call: ");
        String number = scanner.nextLine();
        phone.makeCall(number);
    }
}
