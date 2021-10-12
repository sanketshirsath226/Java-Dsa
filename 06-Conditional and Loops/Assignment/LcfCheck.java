package Assignment;
import java.util.Scanner;

public class LcfCheck {
    public static void main(String[] args) {
        int num1,num2,temp,temp1,temp2,lcf;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num1:");
        num1 = in.nextInt();
        System.out.print("Enter Num2:");
        num2 = in.nextInt();
        temp1=num1;
        temp2=num2;
        while(temp2!=0)
        {
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }
        lcf = (num1*num2)/temp1;
        System.out.print("LCF:"+lcf);
        in.close();
    }
}
