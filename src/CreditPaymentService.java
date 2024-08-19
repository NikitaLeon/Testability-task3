public class CreditPaymentService {
    public double calculate(double amount, double percent, double term) {
        double calculate;
        term = term * 12;
        percent = percent / 100 / 12;
        calculate = amount * (percent / (1 -(Math.pow((1 + percent), -term))));
        return (int) calculate;
    }
}
