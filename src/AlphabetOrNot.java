import java.util.Scanner;
public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
        if (ch>='A' && ch<='Z'){
            System.out.println("character is uppercase");
        }else if (ch>='a' && ch<='z'){
            System.out.println("character is lowercase");
        }else{
            System.out.println("given character is not an alphabet");
        }
    }
}
