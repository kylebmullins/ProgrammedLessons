public class LunchTester {
    public static void main(String[] args) {

        LunchAccount John = new LunchAccount("John Doe");
        System.out.println(John.getID());
        System.out.println(John.getStudent());
        System.out.println(John.getBalance());
        John.addBalance(15.00);
        System.out.println(John.getBalance());
        John.addBalance(10.00);
        System.out.println(John.getBalance());
        John.buyMeal(30.00);
        System.out.println(John.checkApproved());
        John.buyMeal(30.00);
        System.out.println(John.checkApproved());
        System.out.println(John.getBalance());
        System.out.println(John.getSpent());

        LunchAccount Josie = new LunchAccount("Josie Doe", 50.00);
        System.out.println(Josie.getID());
    }
}