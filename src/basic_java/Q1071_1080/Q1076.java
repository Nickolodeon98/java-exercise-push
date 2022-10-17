package basic_java.Q1071_1080;

import java.util.Scanner;

public class Q1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        char p = 'a';
        do {
            System.out.println(p);
            p = (char) ((char) p + 1);
        } while (p < c+1);
    }
}
