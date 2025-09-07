import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        int marks = sc.nextInt();
        if (marks >= 40) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
