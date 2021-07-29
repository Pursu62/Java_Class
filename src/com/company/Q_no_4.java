package com.company;
import java.util.Scanner;
public class Q_no_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int sum=0;
        for(int i=1;i<=5;i++){
            int n = sc.nextInt();
            sum=sum+n;
        }
    double average=sum/5;
        System.out.println("sum is "+sum);
        System.out.println("average"+average);

    }

}
