/* 
448. Find All Numbers Disappeared in an Array
Easy

7814

419

Add to List

Share
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
*/
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class DisappearedNumbers{
    public static void main(String[] args){
        System.out.println(Arrays.toString(findDisappearedNumbers(new int[]{4,1,2,2,1}).toArray()));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[correct]!= nums[i]){
                swap(nums,correct,i);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i]!=(i+1)){
                ans.add(i+1);
            }
        }
        return ans;
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}