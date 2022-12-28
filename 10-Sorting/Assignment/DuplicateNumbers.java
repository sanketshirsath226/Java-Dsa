/*
442. Find All Duplicates in an Array
Medium

7813

297

Add to List

Share
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.
*/

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class DuplicateNumbers{
    public static void main(String[] args){
        System.out.println(Arrays.toString(findDuplicates(new int[]{4,3,2,7,8,2,3,1}).toArray()));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
                int correct = nums[i] - 1;
                if(nums[i]!=nums[correct]){
                    swap(nums,correct,i);
                }else{
                    i++;
                }
            }
        List<Integer> ans = new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i] !=i+1){
                ans.add(nums[i]);
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