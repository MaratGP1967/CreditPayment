public class Main {
    public static void main(String[] args) {

        // А=К*(П/(1+П)-М-1), где A - ануитет, К – сумма кредита, П – процентная ставка, М – количество месяцев

        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000; // сумма займа в руб
        double interestRate = 0.0999 / 12; // процентная ставка
        int months = 36; // срок кредита в месяцах
        System.out.println();
        System.out.println("Аннуитетный платеж за 12 месяцев составит - " + (service.calculate(credit, interestRate, 12)));
        System.out.println();
        System.out.println("Аннуитетный платеж за 24 месяца составит - " + (service.calculate(credit, interestRate, 24)));
        System.out.println();
        System.out.println("Аннуитетный платеж за 36 месяцев составит - " + (service.calculate(credit, interestRate, 36)));
    }
}