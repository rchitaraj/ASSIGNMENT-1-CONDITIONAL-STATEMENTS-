import java.util.Scanner;
public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("character is an alphabet");
        }else if (ch>='0' && ch<='9'){
            System.out.println("character is a digit");
        }else{
            System.out.println("character is a special character");
        }
    }
}
