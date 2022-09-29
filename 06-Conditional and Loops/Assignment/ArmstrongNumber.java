import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args) {
        int arm_num=0,num,temp,temp_num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");    
        num = in.nextInt();
        temp_num=num;
        while(num>0)
        {
            temp = num%10;
            arm_num += (int) Math.pow(temp,(int) Math.log10(temp_num)+1);
            num/=10;
        }
        if(temp_num==arm_num)
        {
            System.out.print(temp_num+" is Armstrong Number");
        }
        else
        {
            System.out.print(temp_num+" is not Armstrong Number");
        }
        in.close();
    }
}
