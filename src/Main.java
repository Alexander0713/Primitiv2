public class Main {
    public static void main(String[] args) {
        int a = 500;
        int b = 1600;
        if (b >= 1000) {
            System.out.println("Итого=" + (a + b + b / 100) + "  Бонусы=" + (b / 100));
        } else {
            System.out.println("Итого=" + (a + b));
        }


    }
}