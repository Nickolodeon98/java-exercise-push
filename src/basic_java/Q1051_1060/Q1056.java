package basic_java.Q1051_1060;

import java.util.Scanner;

public class Q1056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();

        System.out.println((a && !b) || (!a && b));
    }
}
