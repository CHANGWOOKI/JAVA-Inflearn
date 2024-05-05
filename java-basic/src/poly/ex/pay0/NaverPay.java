package poly.ex.pay0;

public class NaverPay implements PayService {
    String option = "네이버페이";
    @Override
    public void processPay(PayService payService, int amount) {
        System.out.println("결제를 시작합니다 : option=" + option + " amount=" + amount);
        System.out.println(payService);

    }
}
