//16. Write a program to assign a grade (A, B, C, D, F) based on percentage using else-if//
import java.util.Scanner;
public class GradeAssigning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of subject 1");
        float  subject1= sc.nextInt();
        System.out.println("enter the marks of subject 2");
        float subject2= sc.nextInt();
        System.out.println("enter the marks of subject 3");
        float  subject3= sc.nextInt();
        System.out.println("enter the marks of subject 4");
        float  subject4= sc.nextInt();
        System.out.println("enter the marks of subject 5");
        float  subject5= sc.nextInt();
        float percentage= ((subject1 +subject2 +subject3 +subject4 +subject5)/500)*100;
        if ( percentage>=90 && percentage <= 100) {
            System.out.println("your grade is A");
        }else if (percentage>=80  && percentage<90) {
            System.out.println("your grade is B");
        }else if (percentage>=70  && percentage<80) {
            System.out.println("your grade is C");
        }else if (percentage>=60 && percentage <40) {
            System.out.println("your grade is D");
        }else if (percentage<=40) {
            System.out.println("your grade is F");
        }else{
            System.out.println("invalid input");
        }

    }
}
