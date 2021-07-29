package Array;
import java.util.Scanner;
public class Lab_4_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number of value you want to put?");
            int sum = 0;
            int n = sc.nextInt();
            int num[] = new int[n];
            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();

            }
            System.out.println("Output");
            for (int j = 0; j < num.length; j++) {
                sum += num[j];
            }
            System.out.println("The sum is "+sum);
            System.out.println("Average is"+sum/num.length);
        }
    }



