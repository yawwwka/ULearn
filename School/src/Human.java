public abstract class Human {
    private boolean isInSchool;

    public void goInSchool(){
        isInSchool = true;
        System.out.println("Пришел в школу");
    }

    public void outFromSchool(){
        isInSchool = false;
        System.out.println("Вышел из школы");
    }
}
