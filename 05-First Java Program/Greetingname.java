//Take name as input and print a greeting message for that name.

import java.util.Scanner;

public class Greetingname {
    public static void main(String[] args)
    {
        System.out.print("Enter Name:");
        String name = (new Scanner(System.in)).nextLine();
        System.out.println("Welcome "+name);
    }
}
