//20. Write a program to input the marks of 3 subjects and print whether the student has passed (all ≥ 40) or failed.//

import java.util.Scanner;
public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks for subject 1");
        int subject1 = sc.nextInt();
        System.out.println("enter the marks for subject 2");
        int subject2 = sc.nextInt();
        System.out.println("enter the marks for subject 3");
        int subject3 = sc.nextInt();
        int marks =((subject1+subject2+subject3/300)*100);
        if (marks>=70 && marks<=100){
            System.out.println("student passed");
        }else if(marks>=50 && marks<70){
            System.out.println("student passed");
        }else if (marks>=40 && marks<50){
            System.out.println("student passed");
        }else{
            System.out.println("student fail");
        }
    }
}
