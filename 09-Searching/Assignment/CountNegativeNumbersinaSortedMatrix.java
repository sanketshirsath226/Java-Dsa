/* 
 1351. Count Negative Numbers in a Sorted Matrix
 Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
 
 Example 1:
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.

Example 2:
Input: grid = [[3,2],[1,0]]
Output: 0
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100
*/
public class CountNegativeNumbersinaSortedMatrix {
    public static void main(String[] args){
        System.out.println(countNegatives(new int[][]{{1,1.-1},{1,1.-1}}));
    }
    public static int countNegatives(int[][] grid) {
        int sum = 0;
        for(int i=0;i<grid.length;i++){
            sum =  sum + countNoNegativeInRow(grid[i]);
        }
        return sum;
    }
    public static int countNoNegativeInRow(int[] arr){
        int n = arr.length;
        int start = 0;
        int end =  n - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]<0){
                end = mid -1;
            }else{
                start = mid + 1;
            } 
        }
        return  n - (end+1);
    }
}
