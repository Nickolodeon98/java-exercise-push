public class CurrencyEX {
    public static void main(String[] args) {
        int currency50000 = 50000;
        int currency10000 = 10000;
        int currency5000 = 5000;
        int currency1000 = 1000;
        int currency500= 500;
        int currency100 = 100;
        int currency50 = 50;
        int currency10 = 10;

        int refund = 25400;

        System.out.printf("50000원 %d개, 나머지 %d원\n", refund / currency50000, refund % 50000);
        refund %= 50000;

        System.out.printf("10000원 %d개, 나머지 %d원\n", refund / currency10000, refund % 10000);
        refund %= 10000;
        
        // 5000원권은 1장만 나오게 하고 싶다. 왜냐하면 25000원에서 2만원은 만원짜리 두개로 처리했기 때문이다.
        System.out.printf("5000원 %d개, 나머지 %d원\n", refund / currency5000, refund % 5000);
        refund %= 5000;

        System.out.printf("1000원 %d개, 나머지 %d원\n", refund / currency1000, refund % 1000);
        refund %= 1000;

        System.out.printf("500원 %d개, 나머지 %d원\n", refund / currency500, refund % 500);
        refund %= 500;

        System.out.printf("100원 %d개, 나머지 %d원\n", refund / currency100, refund % 100);
        refund %= 100;

        System.out.printf("50원 %d개, 나머지 %d원\n", refund / currency50, refund % 50);
        refund %= 50;

        System.out.printf("10원 %d개, 나머지 %d원\n", refund / currency10, refund % 10);
        refund %= 10;
    }
}
