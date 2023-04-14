public class Teacher extends Human {
    private final String name, surname;
    private String subject;
    private int workExp;


    public Teacher(String name, String surname, String subject, int workExp) {
        this.name = name;
        this.surname = surname;
        this.subject = subject;
        this.workExp = workExp;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d", name, surname, subject, workExp);
    }
}