package Class;
import java.util.*;
public class Sorting {
    public static void main(String[] args){
        int[] arr = new int[]{5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swapValue(int[] list,int first,int second){
        int temp = list[first];
        list[first] = list[second];
        list[second] = temp;
    }
    static int getMaxIndex(int[] list,int start,int end){
        int max = start;
        for(int i=start+1;i<=end;i++){
            if(list[max] < list[i]){
                max = i;
            }
        }
        return max;
    }
    static void selectionSort(int[] list){
        for(int i=0;i<list.length;i++){
            int last = list.length - i - 1;
            int maxIndex = getMaxIndex(list,0,last);
            swapValue(list,last,maxIndex);
        }
    }
    
    static void bubbleSort(int[] list){
        boolean swap;
        for(int i=0;i<list.length;i++){
            swap = false;
            for(int j=1;j<list.length - i;j++){
                //Swap if the item is smaller than the previous item
                if(list[j-1] > list[j]){
                    swap = true;
                    swapValue(list,j,j-1);
                }
            }
            if(!swap){
                return;
            }
        }
    }
}
