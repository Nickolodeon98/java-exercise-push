package basic_java.Q1081_1090;

import java.util.Scanner;

public class Q1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int sum = 0;

        int i = 1;

        while (sum < limit) {
            sum += i;
            i++;
        }

        System.out.println(sum);
    }
}
