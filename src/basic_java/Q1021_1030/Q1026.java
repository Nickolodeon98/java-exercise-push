package basic_java.Q1021_1030;

import java.util.Scanner;

public class Q1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");

        String timeInfo = sc.nextLine();

        System.out.println(timeInfo.split(":")[1]);
    }
}
