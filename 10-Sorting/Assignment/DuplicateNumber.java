/* 
287. Find the Duplicate Number
Medium

17563

2420

Add to List

Share
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
 

Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
*/
class DuplicateNumber{
    public static void main(String[] args){
        System.out.println(findDuplicate(new int[]{4,2,1,1,3}));
    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int correct = nums[i] - 1;
                if(nums[correct] != nums[i]){
                    swap(nums,correct,i);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return 0;
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}