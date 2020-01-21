public class App {
    public static void Login(String username) {
        System.out.println("Hello, " + username);
    }
    public static double CalcStockPrice(double price) {
        System.out.println(price = price + (price * 0.10));
        return price;
    }
    public static void AuthToken() {
        System.out.println("Return AuthToken");
    }
    public static void ConnectDB() {
        System.out.println("Init...");
        System.out.println("Connecting DB...");
        System.out.println("Success");
    }
    public static void SetProperty1() {
        System.out.println("Init...");
        System.out.println("Success");
    }
    public static int SubmitForm() {
        System.out.println("STATUS_OK");
        return 200;
    }

}
