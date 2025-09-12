//7. Write a program to check whether a number is divisible by 5 and 11 or not.//
import java.util.Scanner;
public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a =sc.nextInt();
        if (a%5==0 && a% 11==0){
            System.out.println("number is divisble by both 5 and 11");
        }else{
            System.out.println("number is not divisble ");
        }
    }
}
