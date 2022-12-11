import java.util.Arrays;

class Searching{
    public static void main(String[] args) {
        int[] arr = new int[]{50,40,30,20,10};
        int[][] arr2  = new int[][]{
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        }; 
        int[][] arr3 = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 0;
        System.out.println("The target element "+target+" is at "+Arrays.toString(twoDimensionBSRC(arr3, target)));
    }

    /* SIMPLE BINARY SEARCH
       Note :  Works only on Ascending Array
        return -1 : not Found
        return index : found  
    */
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start) / 2 ;
            if(arr[mid]<target){
                start = mid + 1;
            }else if(arr[mid]>target){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    /* Order Agnostic BINARY SEARCH
        Initially checks whether the array is sorted in Ascending or Descending Order
        return -1 : not Found
        return index : found  
    */
    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start) / 2 ;
            if(arr[mid] == target){
                return mid;
               }
            if(isAsc){
                if(arr[mid]<target){
                    start = mid + 1;
                }else if(arr[mid]>target){
                    end = mid - 1;
                }
            }
           else{
            if(arr[mid]<target){
                end = mid - 1;
            }else if(arr[mid]>target){
                start = mid + 1;
            }
           }

        }
        return -1;
    }
    /* 
     2-D Matrix Sorted in Row and Col Wise
     parameters : int - 2-D Arr, int - Target Element 
     return : int[r,c] if found 
              else [-1,-1] 
     */
    static int[] twoDimensionBSRC(int[][] arr,int target){
        int r = 0;
        int c = arr.length - 1;

        while(r<arr.length && c>=0){
            if(arr[r][c] == target){
                return new int[]{r,c};
            }else if(arr[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
     /* SIMPLE BINARY SEARCH WITH SPECIFIC ROW
        parameters : int[][] matrix,
                     int row,
                     int cStart,
                     int cEnd,
                     int target
        return [-1,-1] : not Found
        return [row,col] : found  
    */
    static int[] binarySearchSpecificRow(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            } 
            if(matrix[row][mid] > target){
                cEnd = mid - 1;
            }else{
                cStart = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }

    /* 
     2-D Matrix Sorted
     parameters : int - 2-D Arr, int - Target Element 
     return : int[r,c] if found 
              else [-1,-1] 
     */
    static int[] twoDimensionBSSorted(int[][] matrix,int target)
    {
        int row = matrix.length;
        int col = matrix[0].length;

        if(row == 1){
           return binarySearchSpecificRow(matrix,0,0,col-1,target);
        }

        int rStart = 0;
        int rEnd = row -1;

        int cMid = col / 2;

        while(rStart <(rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][cMid] == target){
                return new int[]{row,mid};
            }
            if(matrix[mid][cMid] > target){
                rEnd = cMid;
            }else{
                rStart = cMid;
            }
        }
        
        // Remaining 2 Rows
        
        //check Whether Element is in cols of 2 rows

        if(matrix[rStart][cMid] == target ){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid] == target ){
            return new int[]{rStart+1,cMid};
        }

        // Search in 1st Part
        if(target<=matrix[rStart][cMid - 1]){
            return binarySearchSpecificRow(matrix,rStart,0,cMid - 1,target);
        }
        // Search in 2nd Part
        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][col-1]){
            return binarySearchSpecificRow(matrix,rStart,cMid+1,col-1,target);
        }
        // Search in 3rd Part
        if(target<=matrix[rStart+1][cMid-1]){
            return binarySearchSpecificRow(matrix,rStart+1,0,cMid-1,target);
        }else{
            // Search in 4th Part
            return binarySearchSpecificRow(matrix,rStart+1,cMid+1,col-1,target);
        }
    }
}
