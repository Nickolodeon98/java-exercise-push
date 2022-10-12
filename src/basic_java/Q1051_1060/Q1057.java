package basic_java.Q1051_1060;

import java.util.Scanner;

public class Q1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();

        System.out.println((a && b) || (!a && !b));
    }
}
