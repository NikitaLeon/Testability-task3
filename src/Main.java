public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платёж: " + (int)service.calculate(1_000_000, 9.99, 1));
        System.out.println("Ежемесячный платёж: " + (int)service.calculate(1_000_000, 9.99, 2));
        System.out.println("Ежеиесячный платёж: " + (int)service.calculate(1_000_000, 9.99, 3));
    }
}