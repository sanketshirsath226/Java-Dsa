import java.util.Scanner;
class Recursion{
    
    /*
        Find Fibonacci of Nth Element
        parameters : int n
        return : int Fibonacci Number
    */
    public static int fibo(int n){
        if ( n == 1 || n == 0){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
    /*
        Implementing Binary Search with help of Recursion
        Recursion variables :
            1. Arguments : start, end, arr,searchElement
            2. Body : mid = (start + (end - start) / 2)
            3. return : return mid / -1
     */
    public static int BinarySearch(int[] arr,int start,int end,int searchElement){
       if (start < end ){
            return -1;
       }

       int mid = start + (end - start) / 2;
       if(arr[mid] == searchElement ){
            return mid;
       }else if(arr[mid] > searchElement){
            return BinarySearch(arr,start,mid - 1,searchElement);
       }else{
        return BinarySearch(arr, mid + 1, end, searchElement);
       }
       
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print(fibo(10));
        input.close();
    }
}