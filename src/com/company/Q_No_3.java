package com.company;
import java.util.Scanner;
public class Q_No_3 {
    public static void main(String[] args) {
        int i,sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a Number");
        int a=sc.nextInt();
        for(i=1;i<=a;i++) {

            sum = sum + i;
        }
        System.out.println("The sum is:"+sum);

        }

    }

