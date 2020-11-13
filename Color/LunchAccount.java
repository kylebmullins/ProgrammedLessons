public class LunchAccount {

    int id;
    String student;
    double balance;
    boolean approved;
    int lunchCount;
    double amountSpent;

    public LunchAccount(String stud) {
        id++;
        student = stud;
    }

    public LunchAccount(String stud, double bal) {
        id++;
        student = stud;
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
        int bonus = 0;
        boolean usedBonus = false;
        balance += amount;
        if ((bonus < 100) && (usedBonus == false)) {
            balance += 20.00;
            bonus++;
            usedBonus = true;
        }
    }
}