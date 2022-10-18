package basic_java.Q1081_1090;

import java.util.Scanner;

public class Q1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        int result = (int) (a * Math.pow(r, (n-1)));
        for (int i = 1; i < n; i++) {
            a *= r;
        }
        System.out.println(a);
        System.out.println(result);

    }
}
