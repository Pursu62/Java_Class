package com.company;
import java.util.Scanner;
public class ArrayPractice {
    static int test2 = 2;
    int test1 = 1;

    public static int addition(int c, int d) {
        return c + d;

    }

    public static void main(String[] args) {
        Scanner kale_alu = new Scanner(System.in);
        System.out.println("Enter a  Number");
        int t = kale_alu.nextInt();
        System.out.println("Enter a second  Number");
        int f = kale_alu.nextInt();


        int a = addition(t, f);
        System.out.println("Total");
        System.out.println(a);

    }


    public String add() {

        System.out.println("hello");
        return "2";
    }
}








