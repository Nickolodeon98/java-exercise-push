package basic_java;

import java.util.Scanner;

public class Q1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String timeStr = sc.nextLine();

        String[] timeArr = timeStr.split(":");

        System.out.printf("%s:%s", timeArr[0], timeArr[1]);
    }
}
