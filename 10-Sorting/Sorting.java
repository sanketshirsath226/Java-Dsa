import java.util.Arrays;
public class Sorting {
    public static void main(String[] args){
        int[] arr = new int[]{1,4,3,2,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
     Swapping the two Element in Array
     parameters : int - 2-D Arr,int First,int Second
     return : none
     */
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
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
                    swap(arr,j-1,j);
                }
            }
            // If No Swapping Occured, The Array is Sorted just break
            if(!isSwap){
                return;
            }
        }
    }
    /*
     Selection Sort
     parameters : int - 2-D Arr
     return : none
    */
    public static void selection(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            int last = (len-1-i);
            int maxIndex = getMaxIndex(arr,0,last);
            if(maxIndex!=last){
                swap(arr,maxIndex,last);
            }
        }
    }

    /*
        Max Element Index Position
        parameters : int - 2-D Arr, int Start , int End
        return : int index
    */

    public static int getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
