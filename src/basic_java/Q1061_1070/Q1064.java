package basic_java.Q1061_1070;

import java.util.Scanner;

public class Q1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a > b ? b : a) > c ? c : (a > b ? b : a));
    }
}
