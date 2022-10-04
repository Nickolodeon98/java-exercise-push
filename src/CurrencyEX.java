public class CurrencyEX {
    public static void main(String[] args) {
        int currency50000 = 50000;
        int currency10000 = 10000;
        int currency5000 = 5000;
        int currency1000 = 1000;
        int currency500= 1000;
        int currency100 = 1000;
        int currency50 = 1000;
        int currency10 = 1000;

        int refund = 25000;

        System.out.printf("50000원 %d장\n", refund / currency50000);
        refund %= currency50000;
        System.out.printf("나머지: %d\n", refund);

        System.out.printf("10000원 %d장\n", refund / currency10000);
        refund %= currency10000;
        System.out.printf("나머지: %d\n", refund);

        System.out.printf("5000원 %d장\n", refund / currency5000);
        refund %= currency5000;
        System.out.printf("나머지: %d\n", refund);

        System.out.printf("1000원 %d장\n", refund / currency1000);
        refund %= currency1000;
        System.out.printf("나머지: %d\n", refund);

        System.out.printf("500원 %d장\n", refund / currency500);
        refund %= currency500;
        System.out.printf("나머지: %d\n", refund);

        System.out.printf("100원 %d장\n", refund / currency100);
        refund %= currency100;
        System.out.printf("나머지: %d\n", refund);

        System.out.printf("50원 %d장\n", refund / currency50);
        refund %= currency50;
        System.out.printf("나머지: %d\n", refund);

        System.out.printf("10원 %d장\n", refund / currency10);
        refund %= currency10;
        System.out.printf("나머지: %d\n", refund);
    }
}
