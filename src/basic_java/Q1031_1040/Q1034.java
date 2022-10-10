package basic_java.Q1031_1040;

import java.util.Scanner;

public class Q1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        int decNum = sc.nextInt();

        String octalNum = Integer.toOctalString(decNum);

        decNum = Integer.parseInt(octalNum, 8);

        System.out.println(decNum);

    }
}
