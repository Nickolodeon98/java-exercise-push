package basic_java.Q1021_1030;

import java.util.Scanner;

public class Q1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        String dateInfo = sc.nextLine();

        String[] date = dateInfo.split("\\.");

        System.out.printf("%02d-%02d-%04d", Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
    }
}
