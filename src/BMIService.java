import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
public class BMIService {
    private BMISystem system;
    private Statistics statistics;
    private Report report;


    public BMIService() {

        system = new BMISystem();
        statistics = new Statistics();
        report = new Report();
    }


    public int getUserCount() {
        return system.getUserCount();
    }
   public void inputUserInfo() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Enter gender (M/F): ");
            char gender = scanner.next().charAt(0);

            System.out.print("Enter height (cm): ");
            double height = scanner.nextDouble();

            System.out.print("Enter weight (kg): ");
            double weight = scanner.nextDouble();

            User user = new User(name, age, gender, height, weight);
            system.addUser(user);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input format. Please enter valid data.");
            scanner.nextLine(); // Clear the input buffer
        } catch (NoSuchElementException e) {
            System.out.println("Input not found. Please enter valid data.");
            scanner.nextLine(); // Clear the input buffer
        }
    }


    public void displayReport() {
        report.generateReport(system);
        statistics.updateStatistics(report);

        int userCount = report.getUserCount();

        if (userCount > 0) {
            System.out.println("========= Report =========");
            System.out.println("User Count: " + userCount);

            for (int i = 0; i < userCount; i++) {
                User user = report.getUser(i);
                System.out.println();
                System.out.println("User " + (i + 1) + ":");
                user.printData();
            }

            System.out.println();
            System.out.println("========= Statistics =========");
            System.out.println("Average BMI: " + statistics.getAverageBMI());
            System.out.println("Max BMI: " + statistics.getMaxBMI());
            System.out.println("Min BMI: " + statistics.getMinBMI());
        } else {
            System.out.println("No users found.");
        }
    }
}
