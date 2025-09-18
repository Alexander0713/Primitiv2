public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int coming = 1600;
        if (coming >= 1000) {
            System.out.println("Итого=" + (balance + coming + coming / 100) + "  Бонусы=" + (coming / 100));
        } else {
            System.out.println("Итого=" + (balance + coming));
        }


    }
}