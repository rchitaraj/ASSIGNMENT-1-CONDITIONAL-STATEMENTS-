//14. Write a program to check whether a given number is greater than 100 and divisible by3.//
import java.util.Scanner;
public class DivisbleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if (a>100 && a%3==0){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }
    }
}
