package basic_java.Q1091_1100;

import java.util.Scanner;

public class Q1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        while (count < n - 1) {
            a = a * m + d;
            count++;
        }
        System.out.println(a);
    }
}
