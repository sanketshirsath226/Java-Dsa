/*
 1309. Decrypt String from Alphabet to Integer Mapping
Easy
1.3K
87
Companies
You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

The test cases are generated so that a unique mapping will always exist.

 

Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
Example 2:

Input: s = "1326#"
Output: "acz"
 

Constraints:

1 <= s.length <= 1000
s consists of digits and the '#' letter.
s will be a valid string such that mapping is always possible.

*/
package Assignment;
import java.util.Arrays;
public class DecryptStringfromAlphabettoIntegerMapping {
    public static void main(String[] args){
        System.out.println(freqAlphabets("1#11#12"));
    }
    public static String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        String sub1 = s.substring(0,s.lastIndexOf("#"));
        String sub2 =s.substring(s.lastIndexOf("#")+1) ;
        System.out.println();
        String[] arr= sub1.split("#");
        System.out.println(Arrays.toString(arr));
        for(String str: arr){
            
            
        }
        // int index = 0;
        // for(String str : arr){
        //     int value = Integer.parseInt(str);
        //     if(value >= 10  && value <=26 ){
        //         result.append((char)(value+96));
        //         index++;
        //     }else{
        //         for(char ch : str.toCharArray()){
        //         result.append((char)(ch+96));
        //         }
        //     }
        // }
        // if(sub2!=""){
        //     arr= sub2.split("");
        //     for(String str : arr){
        //         int value = Integer.parseInt(str);
        //             result.append((char)(value+96));
        //     }
        // }
       
        return result.toString();
    }
}
