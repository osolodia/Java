// Класс Report представляет отчет о пользователях и их ИМТ.
// Содержит массив данных пользователей и массив данных ИМТ, а также информацию о количестве пользователей.
public class Report {
    private User[] userData;
    private double[] bmiData;
    private int userCount;
    private static final int MAX_USERS = 100;
    public int getUserCount() {
        return userCount;
    }

    public double getBMIData(int i) {
        return bmiData[i];
    }

    public User getUser(int i) {
        return userData[i];
    }

    public void generateReport(BMISystem system) {
        userCount = system.getUserCount();
        userData = new User[userCount];
        bmiData = new double[userCount];

        for (int i = 0; i < userCount; i++) {
            userData[i] = system.getUser(i);
            bmiData[i] = system.getUser(i).getBMI();
        }
    }
}