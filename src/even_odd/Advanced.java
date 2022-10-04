package even_odd;

import java.util.Scanner;

public class Advanced {
    private String discern(int num) {
        if (num % 2 == 0) return "짝수";
        else return "홀수";
    }

    public void printResult(int first, int second) {
        System.out.printf("%s+%s=%s", discern(first), discern(second), discern(first + second));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int secNum = sc.nextInt();

        Advanced test = new Advanced();
        test.printResult(firstNum, secNum);
    }
}
