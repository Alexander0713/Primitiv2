public class Main {
    public static void main(String[] args) {
        int balans = 500;
        int prihod = 1600;
        if (prihod >= 1000) {
            System.out.println("Итого=" + (balans + prihod + prihod / 100) + "  Бонусы=" + (prihod / 100));
        } else {
            System.out.println("Итого=" + (balans + prihod));
        }


    }
}