import java.util.Scanner;

public class CountBill {
    public static int[] types = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

    public static void checkBill(int currency) {
        for (int i = 0; i < types.length; i++) {
            int eachNum = currency / types[i];
            currency = currency % types[i];
            System.out.println(types[i] + "원?" + eachNum + "개");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오: ");
        int amount = sc.nextInt();

        checkBill(amount);
    }
}
