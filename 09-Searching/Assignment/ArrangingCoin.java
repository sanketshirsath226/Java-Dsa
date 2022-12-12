/*
 441. Arranging Coins
 You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.S
 Given the integer n, return the number of complete rows of the staircase you will build.
 Example 1:

https://assets.leetcode.com/uploads/2021/04/09/arrangecoins1-grid.jpg
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.
Example 2:

https://assets.leetcode.com/uploads/2021/04/09/arrangecoins2-grid.jpg
Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
 

Constraints:

1 <= n <= 231 - 1
 */

 class ArrangingCoin{
    public static void main(String[] args){
        System.out.println(arrangeCoins(
            3));
    }
    public static int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        while(start <= end){
            long mid = start + (end - start ) / 2;
            long curr = (mid * (mid + 1)) / 2;
            if(curr == n){
                return (int) mid;
            }
            if(curr < n){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return (int) end;
    }
 }