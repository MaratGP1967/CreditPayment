public class CreditPaymentService {
    public int calculate(double credit, double interestRate, int months) {
        //A = K* (S*(1+S)p /((1+S)p-1)), где: А – ежемесячный платеж, K – первоначальная сумма займа,
        // S – ставка по процентам за 1 месяц, P – количество периодов платежей (степень)

        int annuity;
        double myVarS;

        myVarS = Math.pow((1 + interestRate), months);
        annuity = (int)(credit * ((interestRate * myVarS) / (myVarS - 1)));

        return annuity;
    }
}
