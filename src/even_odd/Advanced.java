package even_odd;

import java.util.Scanner;

public class Advanced {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int secNum = sc.nextInt();
        
        if (num % 2 == 0) System.out.print("짝수+");
        else System.out.print("홀수+");

        if (secNum % 2 == 0) System.out.print("짝수=");
        else System.out.print("홀수=");

        if ((num + secNum) % 2 == 0) System.out.print("짝수");
        else System.out.print("홀수");
    }
}
