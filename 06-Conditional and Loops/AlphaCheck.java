// Alphabet Case Check

import java.util.Scanner;

public class AlphaCheck {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Character:");
        char ch = input.next().trim().charAt(0);
        if(ch >= 'a' && ch<='z')
        {
            System.out.println("Alphabet Lowercase");
        }
        else if((ch >= 'A' && ch<='Z'))
        {
            System.out.println("Alphabet Uppercase");
        }
        else
        {
            System.out.println("Not Alphabet");
        }
    }
}
