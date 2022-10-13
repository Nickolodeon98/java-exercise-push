package basic_java.Q1061_1070;

import java.util.Scanner;

public class Q1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a % 2== 0) System.out.println("짝수");
        else System.out.println("홀수");
        
        if (b % 2 == 0) System.out.println("짝수");
        else System.out.println("홀수");
        
        if (c % 2 == 0) System.out.println("짝수");
        else System.out.println("홀수");
    }
}
