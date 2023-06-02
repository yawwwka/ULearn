import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //TODO напишите консольное приложение для работы с классом больница, учитывая, что сгенерированные и вычисленные переменные,
        // нельзя будет менять.
        Hospital hosp = new Hospital(5);
        System.out.println(hosp.patientsTemperatures);
    }
}

class Hospital {
    int patientsCount, countHealthy;
    float[] patientsTemperatures = generatePatientsTemperatures();

    public Hospital(int patientsCount) {
        try {
            this.patientsCount = patientsCount;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    //нужно кол-во пациентов
    public float[] generatePatientsTemperatures() {
        float[] temps = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++){
            temps[i] = (float) (Math.ceil((32 + (Math.random() * 40)) * 100) / 100);
        }
        sout
        return temps;
    }

    //нужна генерация температур
//    public int getCountHealthy() {
//        //TODO реализовать подсчёт кол-ва здоровых(36,2 < x < 36,9) в сгенерированном массиве температур
//        // если метод уже был вызван ранее, не выполнять подсчет снова, а возращать текущее вычисленное значение
//        // если генерация температур не была выполнена, вызвать метод генерации
//
//    }
//
//    //нужна генерация температур
//    public String getTemperaturesToString() {
//        //TODO реализовать получение массива температур в виде строки <double>, <double>, <double>
//        // если метод уже был вызван ранее, не выполнять подсчет снова, а возращать текущее вычисленное значение
//        // если генерация температур не была выполнена, вызвать метод генерации
//    }
//
//    //Нужна генерация температур
//    public double getAverageTemp() {
//        //TODO реализовать получение средней температуры из массива
//        // если метод уже был вызван ранее, не выполнять подсчет снова, а возращать текущее вычисленное значение
//        // если генерация температур не была выполнена, вызвать метод генерации
//    }
//
//    //нужны температуры, средняя температура и кол-во здоровых
//    public static String getReport(float[] temperatureData) {
//        //TODO реализовать получение отчёта в формате приложенном ниже
//        // если метод уже был вызван ранее, не выполнять подсчет снова, а возращать текущее вычисленное значение
//        // если все необходимые переменные не были получены ранее, вызвать все методы необходимые для получения отчёта
//        /*TODO Формат вывода:
//           Температуры пациентов: 37,5 36,9 38,2 33,5 32,2
//           Средняя температура: 35,67
//           Количество здоровых: 1
//         */
//        return "";
//    }
}