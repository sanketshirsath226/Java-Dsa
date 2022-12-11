/*
69. Sqrt(x)
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 

Constraints:

0 <= x <= 231 - 1
*/
class SquareRoot{
    public static void main(String[] args){
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x) {
        if(x == 1){
            return 1;
        }    
       int start = 0;
       int end = x ; 
        while(start<(end-1)){
            int mid = start + (end - start) / 2;
            if(mid == (x/mid)){
                return mid;
            }
            if(mid<x/mid){
                start = mid;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
/* Runtime : 3 ms   Memory : 41.3 MB */