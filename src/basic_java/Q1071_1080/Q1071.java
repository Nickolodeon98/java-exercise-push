package basic_java.Q1071_1080;

import java.util.Scanner;

public class Q1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        reload:
            while(true) {
                a = sc.nextInt();
                if (a == 0) {
                    break reload;
                }
                System.out.println(a);
            }
    }
}
