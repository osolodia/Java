// Класс Statistics представляет статистику по ИМТ.
// Содержит информацию о среднем, максимальном и минимальном ИМТ.
public class Statistics {
    private double averageBMI;
    private double maxBMI;
    private double minBMI;

    public void updateStatistics(Report report) {
        int userCount = report.getUserCount();
        double sumBMI = 0;
        maxBMI = 0;
        minBMI = 0;

        if (userCount > 0) {
            minBMI = report.getBMIData(0);
        }

        for (int i = 0; i < userCount; i++) {
            double bmi = report.getBMIData(i);
            sumBMI += bmi;

            if (bmi > maxBMI) {
                maxBMI = bmi;
            }

            if (bmi < minBMI) {
                minBMI = bmi;
            }
        }

        if (userCount > 0) {
            averageBMI = sumBMI / userCount;
        } else {
            averageBMI = 0;
        }
    }

    public double getAverageBMI() {
        return averageBMI;
    }

    public double getMaxBMI() {
        return maxBMI;
    }

    public double getMinBMI() {
        return minBMI;
    }
}
