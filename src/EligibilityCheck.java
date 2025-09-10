// 5. Write a program to check whether a person is eligible to vote (age ≥ 18).//
import java.util.Scanner;
public class EligibilityCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }
    }
}
