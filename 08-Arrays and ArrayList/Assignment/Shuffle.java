package Assignment;
import java.util.Arrays;
public class Shuffle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }
    public static int[] shuffle(int nums[],int n)
    {
        int[] ans = new int[nums.length];
        for(int i=0,j=0;i<n;i++,j+=2)
        {
                ans[j] = nums[i];
                ans[j+1] = nums[i+n];
        }
        return ans;
       
    }
}
