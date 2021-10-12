// Reverse A String In Java
package Assignment;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String str,rev="";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String:");
        str = in.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.print("Reverse String:"+rev);
        in.close();
    }
}
