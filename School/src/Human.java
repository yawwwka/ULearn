public abstract class Human {
    private boolean isInSchool;

    public boolean isInSchool() {
        return isInSchool;
    }

    public void goInSchool(){
        isInSchool = true;
    }

    public void outFromSchool(){
        isInSchool = false;
    }
}
