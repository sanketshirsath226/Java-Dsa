/*
 33. Search in Rotated Sorted Array
Medium
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104
 */
package LeetCode;

public class SearchInRotatedSortedArray {
    public static void main(String[] args){

    }
    public int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length - 1);
        }

        if(nums[pivot] == target){
            return pivot;
        }

        if(target>= nums[0]){
            return binarySearch(nums,target,0,pivot -1);
        }
        
        return binarySearch(nums,target,pivot + 1,nums.length - 1);
    } 

    //Not Work in Duplicate Values
    public static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid -1;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    // Work in Duplicate Values
    public static int findpivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid -1;
            }   

            if( arr[mid] == arr[start] && arr[end] == arr[mid]){
                //skip duplicates
                //Note : what if start or end is pivot
                //check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int target,int start, int end){
        while(start<=end){
            int mid = start + (end-start) / 2 ;
            if(arr[mid]<target){
                start = mid + 1;
            }else if(arr[mid]>target){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

/*
 Output : 
 Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
Memory Usage: 41.3 MB, less than 93.77% of Java online submissions for Search in Rotated Sorted Array.
 */
