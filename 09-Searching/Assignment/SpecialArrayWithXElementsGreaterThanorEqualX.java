public class SpecialArrayWithXElementsGreaterThanorEqualX {
    public static void main(String[] args){
        System.out.println(specialArray(new int[]{2,3,4}));
    }
    public static int specialArray(int[] nums) {
        int start = 1;
        int end = nums.length;

        while(start < end){
            int mid = end - (end - start) / 2;
            int count = 0;
            for(int i : nums)
                if (i>=mid ) {count++;}
            if(count>=mid){
                start = mid;
            }else{
                end = mid - 1;
            }
        }
        int count = 0;
        for(int i:nums){
            if(i>=start){count++;}    
        }
        if(count == start){
            return start;
        }
        else{
            return -1;
        }
    }
}