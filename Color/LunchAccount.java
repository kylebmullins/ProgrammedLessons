public class LunchAccount {

    static int id;
    static int bonus = 0;
    String student;
    double balance;
    boolean approved;
    int lunchCount;
    double amountSpent;
    boolean usedBonus = false;

    public LunchAccount(String stud) {
        id++;
        student = stud;
    }

    public LunchAccount(String stud, double bal) {
        id++;
        student = stud;
        balance = bal;
    }

    public void buyMeal(double price) {
        if (price <= balance) {
            balance -= price;
            amountSpent += price;
            approved = true;
            lunchCount++;
        } else {
            approved = false;
        }
    }

    public void addBalance(double amount) {
        balance += amount;
        if ((bonus < 100) && (usedBonus == false)) {
            balance += 20.00;
            bonus++;
            usedBonus = true;
        }
    }

    public String getID() {
        if (id < 10) {
            return ("000" + id);
        } else if (id < 100) {
            return ("00" + id);
        } else if (id < 1000) {
            return ("0" + id);
        }
        return Integer.toString(id);
    }

    public double getBalance() {
        return balance;
    }

    public String getStudent() {
        return student;
    }

    public String checkApproved() {
        if (approved) {
            return "Approved";
        }
        return "Denied";
    }

    public double getSpent() {
        return amountSpent;
    }

}