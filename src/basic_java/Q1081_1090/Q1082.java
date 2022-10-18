package basic_java.Q1081_1090;

import java.util.Arrays;
import java.util.Scanner;

public class Q1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[]{10, 11, 12, 13, 14, 15};

        char a = sc.nextLine().charAt(0);

        for (int i = 1; i <= 15; i++) {
            System.out.println(arr[(int)a-65] * i);
        }
    }
}
