// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package Assignment;

import java.util.Scanner;

public class isVoteEligible {
    public static void main(String[] args) {
        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Age:");
        age = in.nextInt();
        System.out.print("Votable:"+isVotable(age));
        in.close();
    }

    private static boolean isVotable(int age) {
        return age>=18;
    }
}
