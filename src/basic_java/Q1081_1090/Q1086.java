package basic_java.Q1081_1090;

import java.util.Scanner;

public class Q1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();

        double result = w * h * b;

        System.out.printf("%.2f MB", result/ (8 * 1024 * 1024));
    }
}
