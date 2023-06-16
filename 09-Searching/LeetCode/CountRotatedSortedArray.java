/*
 
 */
package LeetCode;

public class CountRotatedSortedArray {
    public static void main(String[] args){
        int[] arr= {4,5,6,7,0,1,2};
        System.out.println(countRotate(arr));
    }   
    public static int countRotate(int[] nums){
        int pivot = findpivot(nums);
        return pivot + 1;
    }
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

            if( arr[mid] == arr[start] && arr[end] == arr[mid]){
                //skip duplicates
                //Note : what if start or end is pivot
                //check if start is pivot
                if(start > end && arr[start] > arr[start+1]){
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
}
