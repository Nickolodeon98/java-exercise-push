package basic_java.Q1031_1040;

import java.util.Scanner;

public class Q1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        int toConvert = sc.nextInt();

        String octalStr = Integer.toOctalString(toConvert);
        System.out.println(octalStr);
    }
}
