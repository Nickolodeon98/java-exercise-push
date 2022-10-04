package even_odd;

import java.util.Scanner;

public class Advanced {

    private int multipleTargetNum = 2;

    public Advanced(int multipleNum) {
        this.multipleTargetNum = multipleNum;
    }

    public String isMultiple(int num) {
        if (num % multipleTargetNum == 0) return "multiple";
        else return "not multiple";
    }

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

        Advanced test = new Advanced(3);
        test.printResult(firstNum, secNum);

        System.out.println(test.isMultiple(245));
    }
}
