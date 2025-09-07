import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("enter a number");
        int b=sc.nextInt();
        System.out.println("enter the operator");
        int operator=sc.nextInt();
        switch (operator) {
            case 1:
                int add =a + b;
                System.out.println("result "+ add);
                break;
            case 2:
                int subtract = a - b;
                System.out.println("result "+ subtract);
                break;
            case 3:
                int multiply = a * b;
                System.out.println("result "+ multiply);
                break;
            case 4:
                double divison = a / b;
                System.out.println("result "+ divison);
                break;
            default:
                System.out.println("invalid operator");
        }
    }
}
