package com.company;
import java.util.Scanner;
public class Pursu {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number from 0 to 3: ");
            char a = sc.next().charAt(0);
            if(a=='0'){
                System.out.println("Welcome");
            }
            else if(a=='1'){
                System.out.println("Hello");
            }
            else if(a=='2'){
                System.out.println("Have a nice day");
            }
            else if(a=='3'){
                System.out.println("Thank you");
            }
            else {
                System.out.println("Wrong input");
            }

        }
    }



