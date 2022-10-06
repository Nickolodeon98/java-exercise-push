package basic_java.Q1021_1030;

import java.util.Scanner;

public class Q1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(">>> ");
        float num = sc.nextFloat(); //(+/-) 1.4 x 10^-45 ~ (+/-) 3.4028235 x 10^38 안의 범위를 표현 가능

        int numPart = (int) num;

        float floatPart = num - (float) numPart;

        System.out.printf("%d + %.4f", numPart, floatPart);
    }
}
