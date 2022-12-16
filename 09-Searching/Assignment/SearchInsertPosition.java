public class SearchInsertPosition {
    public static void main(String[] args){
       System.out.println(searchInsert(new int[]{1,3,5,6},7));
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end -start ) /2;
            if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return end+1;
    }
}
