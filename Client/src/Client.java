public abstract class Client {
    /*TODO написать классы Client, IndividualBusinessman, PhysicalPerson и LegalPerson
        с методами put(), take(), getAmount()
    */
    abstract void put();
    abstract void take();
    public void getAmount(){

    }
}

class PhysicalPerson extends Client {
    @Override
    void put(){

    }

    @Override
    void take(){

    }
}

class LegalPerson extends PhysicalPerson {
    @Override
    void put() {
        super.put();
    }

    @Override
    void take() {
        super.take();
    }
}

class IndividualBusinessman extends PhysicalPerson {

}