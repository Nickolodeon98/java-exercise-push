package basic_java;

import java.util.Scanner;

public class Q1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] idNum = sc.nextLine().split("-");

        System.out.printf("%s%s", idNum[0], idNum[1]);
    }
}
