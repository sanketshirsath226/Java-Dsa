package Class;

public class SearchInRange {
    public static void main(String[] args) {

    }
    // search in array within range(start,end) : return index if item found
    // otherwise if item is not found return -1
    public static int searchInRange(int[] arr,int target,int start,int end){
        if(arr.length == 0 || arr.length+1<end || start<=-1) return -1;

        for(int i=start;i<=end ; i++)
            if(arr[i] == target) return i;

        //this line will execute if none of the element matches the target element
        // hence target not found
        return -1;
    }
}
