package basic_java.Q1021_1030;

import java.util.Scanner;

public class Q1025 {
    public static void main(String[] args) {
        int[] numUnit = {10000, 1000, 100, 10, 1};

        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        int num = sc.nextInt();

        for (int elem : numUnit) {
            int value = num / elem * elem;
            System.out.printf("[%d]\n", value);
            num -= value;
        }

    }
}
