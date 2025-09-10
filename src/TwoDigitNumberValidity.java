//10. Write a program to check whether a number is a two-digit number or not. //
import java.util.Scanner;
public class TwoDigitNumberValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        if ((a>=10 && a<=99) || (a>=-99 && a<=-10)){
            System.out.println("it is a two digit number");
        }else{
            System.out.println("not a two digit number");
        }
    }
}
