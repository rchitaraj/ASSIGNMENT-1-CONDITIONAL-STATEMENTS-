import java.util.Scanner;
public class NumberPositiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int a =sc.nextInt();
        if (a>0){
            System.out.println("number is positive");
        }else if (a==0){
            System.out.println("number is zero");
        }else{
            System.out.println(("number is negative"));
        }
    }

}
