// Класс User представляет пользователя и содержит информацию о нем, включая имя, возраст, пол, рост, вес и ИМТ.
// Содержит методы для расчета и обновления ИМТ, а также для вывода данных пользователя.
public class User {
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private double bmi;

    public User() {
        name = "0";
        age = 0;
        gender = '0';
        height = 0;
        weight = 0;
        bmi = 0;
    }

    public User(String name, int age, char gender, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        calculateBMI();
    }

    public String getName() {
        return name;
    }

    public double getBMI() {
        return bmi;
    }

    private void calculateBMI() {
        double heightInMeters = height / 100.0;
        bmi = weight / (heightInMeters * heightInMeters);
    }

    public void updateUserInfo(String name, int age, char gender, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        calculateBMI();
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("BMI: " + bmi);
    }
}
