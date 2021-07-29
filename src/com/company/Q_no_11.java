package com.company;

public class Q_no_11 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 4; i++) {
            for(j=i;j<=4;j--){
                System.out.println(" ");
            }
            for(j=1;j<=i;j++);
            System.out.print(i+" ");
        }
        System.out.println();
    }
}