package basic_java.Q1021_1030;

import java.util.Scanner;

public class Q1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) System.out.println(word.charAt(i));
    }
}
