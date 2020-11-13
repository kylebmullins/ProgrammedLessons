public class LunchTester {
    public static void main(String[] args) {
        LunchAccount John = new LunchAccount("John Doe");
        System.out.println(John.id);
        LunchAccount Josie = new LunchAccount("Josie Doe", 50.00);
        System.out.println(Josie.id);
    }
}