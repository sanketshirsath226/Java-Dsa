//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
//Assume That Array is infinite
// Maybe Raise ArrayIndexBound Issue

package LeetCode;
public class FindPositionOfAnElementInASortedArrayOfInfiniteNumbers {
    public static void main(String[] args){
       System.out.println(ans(new int[]{3, 5, 7, 9, 10, 90, 100, 130,
        140, 160, 170},10));
    }
    static int ans(int[] list,int target){
        int start = 0;
        int end = 1;
        while(list[end] < target){
            int newStart = end + 1;
            // double the size of box
            // end = previousEnd + sizeOfBox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(list,target,start,end);
    }
    static int binarySearch(int[] list,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start) / 2 ;
            if(list[mid] == target){
                return mid;
            }
            if(list[mid]<target){
                start = mid + 1;
            }else if(list[mid]>target){
                end = mid - 1;
            }
        }
        return -1;
    }
}