import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMIService bmiService = new BMIService();

        while (true) {
            System.out.println("========= Menu =========");
            System.out.println("1. Add User");
            System.out.println("2. Display Report");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("------ Add User ------");
                    bmiService.inputUserInfo();
                    break;
                case 2:
                    System.out.println("------ Display Report ------");
                    bmiService.displayReport();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }
    }
}