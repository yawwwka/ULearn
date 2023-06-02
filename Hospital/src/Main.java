import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Hospital hosp = new Hospital(13);
        System.out.println(hosp.getHealthyCount());
        System.out.println(hosp.getAvgTemp());
        System.out.println(hosp.getTempString());
        System.out.println(hosp.getReport());
    }
}

class Hospital {
    private final int patientsCount;
    private final int healthyCount;
    private final double avgTemp;
    private final float[] temperatures;
    private final String tempString;
    private boolean flag = false;

    public int getHealthyCount() {
        return healthyCount;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public String getTempString() {
        return tempString;
    }

    public Hospital(int patientsCount) {
        this.patientsCount = patientsCount;
        this.temperatures = generatePatientsTemperatures();
        this.healthyCount = getCountHealthy();
        this.avgTemp = getAverageTemp();
        this.tempString = getTemperaturesToString();
    }

    //нужно кол-во пациентов
    float[] generatePatientsTemperatures() {
        if (!flag) {
            try {
                final int roundCount = 10;
                float[] temperatures = new float[patientsCount];
                for (int i = 0; i < patientsCount; i++) {
                    float temperature = (Math.round(((new Random()).nextInt(8) + 32 + (new Random()).nextFloat()) * roundCount));
                    temperatures[i] = temperature / roundCount;
                }
                flag = true;
                return temperatures;
            } catch (Exception e) {
                throw new IllegalArgumentException();
            }
        } else return temperatures;
    }

     double getAverageTemp() {
        double summ = 0, avg;
        for (float each : temperatures) {
            summ += each;
        }
        avg = summ / temperatures.length;
        return avg;
    }

    int getCountHealthy() {
        int healthyCount = 0;
        for (float patient : temperatures) {
            if (36.2 < patient && patient < 36.9) {
                healthyCount++;
            }
        }
        return healthyCount;
    }

    String getTemperaturesToString() {
        String tempString = "";
        for (int i = 0; i < temperatures.length; i++) {
            if (i != temperatures.length - 1) {
                tempString += String.valueOf(temperatures[i]).replace('.', ',') + " ";
            } else {
                tempString += String.valueOf(temperatures[i]).replace('.', ',');
            }
        }
        return tempString;
    }

    //нужны температуры, средняя температура и кол-во здоровых
    public String getReport() {
        //TODO реализовать получение отчёта в формате приложенном ниже
        // если метод уже был вызван ранее, не выполнять подсчет снова, а возращать текущее вычисленное значение
        // если все необходимые переменные не были получены ранее, вызвать все методы необходимые для получения отчёта
        /*TODO Формат вывода:
           Температуры пациентов: 37,5 36,9 38,2 33,5 32,2
           Средняя температура: 35,67
           Количество здоровых: 1
         */
        return "Температуры пациентов: " + tempString + "\nСредняя температура: " + String.format("%.2f", avgTemp).replace('.', ',') + "\nКоличество здоровых: " + healthyCount;
    }
}