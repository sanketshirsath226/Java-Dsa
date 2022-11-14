import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 66. Plus One
Easy

5797

4572

Add to List

Share
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
 */

public class PlusOne {
    static class Solution {
        public int[] plusOne(int[] digits) {
            int count=0;
            int len = digits.length;
            for(int i=len-1;i>=0;i--){
                if(checkForNonCarryValue(i, digits)){
                    return digits;
                }
            }
            int[] result = new int[len+1];
            result[0] = 1;
            return result;
        }   
        public boolean checkForNonCarryValue(int index,int[] arr){
            arr[index] +=1;
            if(arr[index] == 10 ){
                arr[index] = 0;
                return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.plusOne(new int[]{9})));
    }
}