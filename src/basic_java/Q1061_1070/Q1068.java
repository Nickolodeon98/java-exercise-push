package basic_java.Q1061_1070;

import java.util.Scanner;

public class Q1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (90 < a && a < 100) System.out.println("A");
        else if (70 < a && a < 89) System.out.println("B");
        else if (40 < a && a < 69) System.out.println("C");
        else if (0 < a && a < 39) System.out.println("D");
    }
}
