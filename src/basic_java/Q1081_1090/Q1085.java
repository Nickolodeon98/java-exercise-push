package basic_java.Q1081_1090;

import java.util.Scanner;

public class Q1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();

        double result = h * b * c * s;
        System.out.printf("%.1f MB", (result / (8 * 1024 * 1024)));
    }
}
