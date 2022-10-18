package basic_java.Q1081_1090;

import java.util.Scanner;

public class Q1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int result = a + b * (n-1);
        System.out.println(result);
    }
}
