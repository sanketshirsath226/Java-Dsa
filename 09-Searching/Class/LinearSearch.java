package Class;

public class LinearSearch {
    public static void main(String[] args) {
    int[] arr = {5,2,3,1,4};
    System.out.println(linearSearch(arr,1));
    }

    // search in array : return index if item found
    // otherwise if item is not found return -1
    public static int linearSearch(int[] arr,int target){
        if(arr.length == 0) return -1;

       for(int i=0;i<arr.length ; i++)
           if(arr[i] == target) return i;

        //this line will execute if none of the element matches the target element
        // hence target not found
        return -1;
    }

    // search in array : return element if item found
    // otherwise if item is not found return -1
    public static int linearSearch2(int[] arr,int target){
        if(arr.length == 0) return -1;

        for(int element : arr)
            if(element == target) return element;

        //this line will execute if none of the element matches the target element
        // hence target not found
        return -1;
    }
}
