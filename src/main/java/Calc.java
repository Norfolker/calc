public class Calc {

    public int payment(double sum, double percent, double creditPeriod) {
        return (int) (sum / creditPeriod * percent);
    }

    public int sumPays(double sum, double percent, double creditPeriod) {
        return (int) (sum * creditPeriod * percent);
    }

    public int overPay(double sum, double percent, double creditPeriod) {
        return (int) (Math.pow(percent, (creditPeriod / 12)) * sum - sum);
    }
}