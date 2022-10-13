package LogicalProgram;

import java.util.Scanner;

public class FebonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0; int b =1;
        System.out.println(a + " " + b);
        int c;
        for (int i=1;i<n; i++ ){
            c= a+b;
            System.out.println(" " +c);
            a=b;
            b=c;
        }

    }
}


