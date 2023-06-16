package Class;
//Ceiling of a number
public class Ceiling {
    public static void main(String[] args){
        int[] arr = new int[]{
            2,3,5,9,14,16,18
         };
        System.out.println(arr[binarySearch(arr,18)]);
    }
    //return the index
    // return -1 if element not found
    static int binarySearch(int[] list,int target){
        int start = 0;
        int end = list.length - 1;

        while(start<=end){
            //  int mid = (start + end) / 2;  Possible but may give error on bigger list
            int mid = start + (end - start) / 2; // Similar value but eliminates the issue
            if(list[mid] == target){
                return mid;
            }
            if(list[mid] > target) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;

    }
}
