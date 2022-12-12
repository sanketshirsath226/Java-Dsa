/*
367. Valid Perfect Square

Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false
 

Constraints:

1 <= num <= 2^31 - 1
*/
class ValidPerfectSquare {
    public static void main(String[] args){
        System.out.println(isPerfectSquare(104976));
    }
    public static boolean isPerfectSquare(int num) {
        if(num == 1 || num == 0){
            return true;
        }
        int start = 1;
        int end = num;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid == (((float)num/mid))){
                return true;
            }
            if(mid > (num/mid)){
                end = mid - 1;
            }else{
                start = mid  + 1;
            } 
        }
        return false;
    }
}
/* Runtime: 0 ms Memory Usage: 39 MB */