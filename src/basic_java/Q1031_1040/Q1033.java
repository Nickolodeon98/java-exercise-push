package basic_java.Q1031_1040;

import java.util.Scanner;

public class Q1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        int decNum = sc.nextInt();

        String bigHexNum = Integer.toHexString(decNum);

        bigHexNum = bigHexNum.toUpperCase();

        System.out.println(bigHexNum);

    }
}
