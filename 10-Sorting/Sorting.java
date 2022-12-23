import java.util.Arrays;
public class Sorting {
    public static void main(String[] args){
        int[] arr = new int[]{1,4,3,2,0};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }   
    /*
     Bubble Sort
     parameters : int - 2-D Arr
     return : none
     */
    public static void bubble(int[] arr){
        boolean isSwap;
        int arrLength = arr.length;
        //Run the Loop for N-1 Times
        for(int i=0;i<arrLength;i++){
            isSwap = false;
            //For Each Step, Max Item will come at the last respective index 
            for(int j=1;j<(arrLength-i);j++){
                //Swap Values if the item is smaller than previous item
                if(arr[j-1] > arr[j]){
                    isSwap = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            // If No Swapping Occured, The Array is Sorted just break
            if(!isSwap){
                return;
            }
        }
    } 
}
