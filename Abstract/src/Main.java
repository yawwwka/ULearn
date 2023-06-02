public class Main {
    PhysicalPerson loh = new PhysicalPerson();

}

abstract class Client {
    float balance;

    public float getAmount() {
        return balance;
    }

    public void put(float popoln) {
        if (popoln > 0) {
            balance += popoln;
        }
    }

    public void take(float snyat) {
        if (snyat <= balance && snyat > 0) {
            balance = -snyat;
        }
    }
}

class PhysicalPerson extends Client {

}

class LegalPerson extends PhysicalPerson {
    @Override
    public void take(float snyat) {
        if (1.01 * snyat <= balance && snyat > 0) {
            balance = (float) (-snyat - 0.01 * snyat);
        }
    }
}

class IndividualBusinessman extends PhysicalPerson {
    @Override
    public void put(float popoln) {
        if (popoln > 0) {
            if (popoln < 1000) {
                balance = (float) (+popoln - 0.01 * popoln);
            } else {
                balance = (float) (+popoln - 0.005 * popoln);
            }
        }
    }

}