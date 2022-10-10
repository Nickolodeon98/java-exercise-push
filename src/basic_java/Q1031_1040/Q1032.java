package basic_java.Q1031_1040;

import java.util.Scanner;

public class Q1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        int toConvert = sc.nextInt();

        String hexNum = Integer.toHexString(toConvert);
        System.out.println(hexNum);
    }
}
