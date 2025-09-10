//17. Write a program to check whether a number is a multiple of 2, 3, both, or none. //
import java.util.Scanner;
public class MultipleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if (num%2==0 && num%3==0) {
            System.out.println("multiple of both");
        }else if (num%2==0){
            System.out.println("multiple of 2");
        }else if (num%3==0) {
            System.out.println("multiple of 3");
        }else{
            System.out.println("multiple of neither of 2 or 3");
        }
    }
}
