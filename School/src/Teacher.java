public class Teacher extends Human {
    private final String firstName, lastName;
    private String subject;
    private int workExp;


    public Teacher(String firstName, String lastName, String subject, int workExp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.workExp = workExp;
    }

    @Override
    public String toString() {
        return String.format("Имя - %s \nФамилия - %s \nПредмет - %s \nСтаж работы - %d", firstName, lastName, subject, workExp);
    }
}