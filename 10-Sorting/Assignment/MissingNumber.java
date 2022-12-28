/* 
268. Missing Number
Easy
8.3K
3K
Companies
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 

Constraints:

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.
*/
class MissingNumber{
<<<<<<< HEAD
    public static void main(String[] args){
        System.out.println(missingNumber(new int[]{4,3,1,0}));
    }

    public static int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i] !=i){
                return i;
            }
        }
        return arr.length;
    }

    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
=======
    public static void main(){

    }

    public static int missingNumber(int[] nums) {
        
    }

>>>>>>> c9f3f5d09efb487cb3b1acf6be46aeb6dc7fd94f
}