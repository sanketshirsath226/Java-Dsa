package Assignment;

import java.util.Scanner;

public class FutureInvestVal {
    public static void main(String[] args) {
        int pv,n,fv;
        double ir;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter present value:");
        pv = in.nextInt();
        System.out.print("Enter the interest rate:");
        ir = in.nextInt();
        ir = ir/100;
        System.out.print("Enter the year:");
        n = in.nextInt();
        fv = (int) (pv*(Math.pow((1+ir), n)));
        System.out.printf("Future Value:"+fv);
        in.close();
    }
}
