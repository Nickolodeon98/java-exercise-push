package basic_java;

import java.util.Scanner;

public class Q1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dateStr = sc.nextLine().split("\\.");

        System.out.printf("%02d.%02d.%02d", Integer.parseInt(dateStr[0]), Integer.parseInt(dateStr[1]), Integer.parseInt(dateStr[2]));


    }
}
