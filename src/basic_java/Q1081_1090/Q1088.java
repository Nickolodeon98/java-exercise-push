package basic_java.Q1081_1090;

import java.util.Scanner;

public class Q1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int i = 1;
        while (i <= limit) {
            if (i % 3 != 0) System.out.print(i + " ");
            i++;
        }
    }
}
