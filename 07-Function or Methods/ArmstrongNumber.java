public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.print("3 Digit Armstrong No:");
        for(int i=100;i<1000;i++)
        {
            if(isArmstrongNo(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    static boolean isArmstrongNo(int n)
    {
        int original = n,sum=0;
        while(n>0)
        {
            sum+=(int) Math.pow((n%10),3);
            n/=10;
        }
        return (original==sum);
    }
}
