/* 
 852. Peak Index in a Mountain Array
Medium
5.2K
1.8K
Companies
An array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.

 

Example 1:

Input: arr = [0,1,0]
Output: 1
Example 2:

Input: arr = [0,2,1,0]
Output: 1
Example 3:

Input: arr = [0,10,5,2]
Output: 1
 

Constraints:

3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.

*/
package LeetCode;
public class PeakIndexInAMountainArray{
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        // Perform until start !=end
        while(start<end){
            int mid = start + (end - start) / 2;
            if(arr[mid+1] < arr[mid]) {
                // We are descending part of the array
                // Maybe there will be number greater than current number
                // end = mid;
                // end !=mid -1 because we don't have gurantee 
                end = mid;
            }else{
                 // We are ascending part of the array
                 // start = mid + 1 bcoz we know mid+1 > mid
                start = mid + 1;
            }
        }  
        // We can return any end and start both
        // because start and end both pointer are checking for max element (2 checks)  
        return start;
    }
}
/*
 Runtime : 9ms
 Memory : 55.3ms
 */