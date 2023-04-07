public class CreditPaymentService {
    public int calculate(int creditAmount, int month, double rate) {
        double rateMonth = (rate / 100) / 12;
        double ann = (rateMonth * (Math.pow((1 + rateMonth), month))) / ((Math.pow((1 + rateMonth), month)) - 1);
        double mPay = ann * creditAmount;
        int monthPay = (int) mPay;
        return monthPay;
    }
}