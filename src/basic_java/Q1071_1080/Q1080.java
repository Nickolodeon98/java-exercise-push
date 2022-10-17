package basic_java.Q1071_1080;

import java.util.Scanner;

public class Q1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (sum < a) {
            count++;
            sum += count;
        }
        System.out.println(count);
    }
}
