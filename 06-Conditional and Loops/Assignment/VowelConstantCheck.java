package Assignment;
import java.util.Scanner;

public class VowelConstantCheck {
    public static void main(String[] args) {
        char ch;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Character:");
        ch = in.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.print(ch+" is a vowel");
        }
        else
        {
            System.out.print(ch+" is a constant");
        }
        in.close();
    }
}
