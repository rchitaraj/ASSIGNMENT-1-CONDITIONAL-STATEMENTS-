import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 3 digit number");
        int num = sc.nextInt();
        int first = num / 100;
        int second = ((num % 100) / 10);
        int third = num / 100;
        int reverse =((third * 100) + (second * 10) + (first));
        if (reverse==num) {
            System.out.println("palindrome number");
        }else {
            System.out.println("not a palindrome number");
        }
    }
}

