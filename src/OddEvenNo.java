//2.Write a Java program to check if a number entered by the user is even or odd.//
import java.util.Scanner;
public class OddEvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
