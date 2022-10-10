package basic_java.Q1031_1040;

import java.util.Scanner;

public class Q1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        int inputNum = sc.nextInt();

        String octalNum = Integer.toOctalString((Integer.parseInt(Integer.toHexString(inputNum), 16)));

        System.out.println(octalNum);
    }
}
