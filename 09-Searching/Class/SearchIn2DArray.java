package Class;
import java.util.*;
public class SearchIn2DArray {
    public static void main(String[] args){
        int[][] arr = {
           {10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160}
        };
        System.out.println(Arrays.toString(SearchInStrictlySortedMatrix(arr,-100)));
    }
    static int[] search(int[][] list,int target){
        for(int row=0;row<list.length;row++)
            for(int col=0;col<list[row].length;col++)
                if(list[row][col] == target) return new int[]{row,col};
        return new int[]{-1,-1};
    }
    static int max(int[][] list){
        int max = Integer.MIN_VALUE;
        for(int row[]:list)
            for(int element:row)
                if(max < element) 
                    max = element;
        return max;
    }
    /*
     Search in row and col sorted array : return [row index,col index] if item found
     otherwise if item is not found return -1
     Technique : Elimination technique
    */
    
    static int[] SearchInRowAndColWiseSortedArray(int[][] list,int target){
        int row = 0;
        int col = list.length - 1;
        while(col>=0 && row<list.length){
            if(list[row][col] == target){
                return new int[]{row,col};
            }else if(list[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
     /*
     Search in strictly sorted matrix : return [row index,col index] if item found
     otherwise if item is not found return -1
     Technique : Row Elimination technique
    */
    static int[] binarySearch(int[][] list,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(list[row][mid] == target ){
                return new int[]{row,mid};
            }else if(list[row][mid] > target){
                cEnd = mid - 1;
            }else{
                cStart = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] SearchInStrictlySortedMatrix(int[][] list,int target){
        int row = list.length;
        int cols = list[0].length;

        if(row == 1){
            return binarySearch(list,0,0,cols-1,target);    
        }
        int rStart = 0;
        int rEnd = row - 1;
        int cMid = cols/2;
        //run the loop until there are 2 rows left
        while(rStart < (rEnd - 1)){
           int mid = rStart + (rEnd - rStart) / 2 ;
            if(list[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(list[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        //Now we have two rows left
        //Check whether the target is in col of 2 rows
        if(list[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(list[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }
        //Searching:
        //1st Part
        if(target<=list[rStart][cMid-1]){
                return binarySearch(list,rStart,0,cMid-1,target);
        }
        //2nd Part
        if(target>=list[rStart][cMid+1] && target<=list[rStart][cols-1]){
            return binarySearch(list,rStart,cMid+1,cols-1,target);
        }
        //3rd Part
        if(target<=list[rStart+1][cMid-1]){
            return binarySearch(list,rStart+1,0,cMid-1,target);

        }
        //4th Part
        else{
            return binarySearch(list,rStart+1,cMid+1,cols-1,target);
        }
    }

}
