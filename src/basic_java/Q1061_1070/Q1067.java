package basic_java.Q1061_1070;

import java.util.Scanner;

public class Q1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("음수");
            if (a % 2 == 0) System.out.println("짝수");
            else System.out.println("홀수");
        } else {
            System.out.println("양수");
            if (a % 2 == 0) System.out.println("짝수");
            else System.out.println("홀수");
        }
    }
}
