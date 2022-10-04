package even_odd;

import java.util.Scanner;

public class Advanced {
    private String getEvenOdd(int num) {
        if (num % 2 == 0) return "짝수";
        else return "홀수";
    }

    public void printEvenOddStatement(int first, int second) {
        System.out.printf("%s+%s=%s", getEvenOdd(first), getEvenOdd(second), getEvenOdd(first + second));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int secNum = sc.nextInt();

        Advanced test = new Advanced();
        test.printEvenOddStatement(firstNum, secNum);
    }
}
