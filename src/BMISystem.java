// Класс BMISystem представляет систему управления пользователями и их ИМТ.
// Хранит информацию о количестве пользователей и содержит массив пользователей.
public class BMISystem {
    private static final int MAX_USERS = 100;

    private int userCount;
    private User[] userList;

    public BMISystem() {
        userCount = 0;
        userList = new User[MAX_USERS];
    }

    public User getUser(int i) {
        return userList[i];
    }

    public int getUserCount() {
        return userCount;
    }

    public void addUser(User user) {
        if (userCount < MAX_USERS) {
            userList[userCount] = user;
            userCount++;
        }
    }

    public void removeUser(String name) {
        for (int i = 0; i < userCount; i++) {
            if (userList[i].getName().equals(name)) {
                for (int j = i; j < userCount - 1; j++) {
                    userList[j] = userList[j + 1];
                }
                userCount--;
                break;
            }
        }
    }

    public double calculateAverageBMI() {
        double totalBMI = 0;
        for (int i = 0; i < userCount; i++) {
            totalBMI += userList[i].getBMI();
        }
        if (userCount > 0) {
            return totalBMI / userCount;
        } else {
            return 0;
        }
    }
}