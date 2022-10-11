package basic_java.Q1041_1050;

import java.util.Scanner;

public class Q1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a + b + c);
        System.out.printf("%.1f", (float)(a + b + c) / 3);
    }
}
