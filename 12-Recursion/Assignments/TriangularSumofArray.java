package Assignments;

/*
   2221. Find Triangular Sum of an Array
   Link : https://leetcode.com/problems/find-triangular-sum-of-an-array/
    Medium

    The triangular sum of nums is the value of the only element present in nums after the following process terminates:

    Let nums comprise of n elements. If n == 1, end the process. Otherwise, create a new 0-indexed integer array newNums of length n - 1.
    For each index i, where 0 <= i < n - 1, assign the value of newNums[i] as (nums[i] + nums[i+1]) % 10, where % denotes modulo operator.
    Replace the array nums with newNums.
    Repeat the entire process starting from step 1.
    Return the triangular sum of nums.

    

    Example 1:


    Input: nums = [1,2,3,4,5]
    Output: 8
    Explanation:
    The above diagram depicts the process from which we obtain the triangular sum of the array.
    Example 2:

    Input: nums = [5]
    Output: 5
    Explanation:
    Since there is only one element in nums, the triangular sum is the value of that element itself.

*/

public class TriangularSumofArray {

    public static int triangularSum(int[] nums) {
        if(nums.length -1 == 0 ){
            return nums[0];
        }
        
        int[] temp = new int[nums.length - 1];
        helper(temp,nums,0);
        return triangularSum(temp);
    }
    public static int[] helper(int[] temp,int nums[],int index){
        if(nums.length-1== index){
            return temp;
        }
        
        temp[index] = (nums[index] + nums[index+1])%10;
        return helper(temp,nums,index+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print(triangularSum(arr));
    }   
}

/*
 Runtime: 58 ms, faster than 27.39% of Java online submissions for Find Triangular Sum of an Array.
 Memory Usage: 44 MB, less than 72.73% of Java online submissions for Find Triangular Sum of an Array.   
*/