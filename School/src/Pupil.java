public class Pupil extends Human {
    /*напишите класс Pupil
      формат вывода toString(): имя фамилия год поступления
     */
    private final String name, surname;
    private final int year;


    public Pupil(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", name, surname, year);
    }
}
