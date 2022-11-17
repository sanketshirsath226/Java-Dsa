/* 
-> https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
1217. Minimum Cost to Move Chips to The Same Position 
Easy
1.8K
235
Companies
We have n chips, where the position of the ith chip is position[i].

We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:

position[i] + 2 or position[i] - 2 with cost = 0.
position[i] + 1 or position[i] - 1 with cost = 1.
Return the minimum cost needed to move all the chips to the same position.

 

Example 1:


Input: position = [1,2,3]
Output: 1
Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
Second step: Move the chip at position 2 to position 1 with cost = 1.
Total cost is 1.
Example 2:


Input: position = [2,2,2,3,3]
Output: 2
Explanation: We can move the two chips at position  3 to position 2. Each move has cost = 1. The total cost = 2.
Example 3:

Input: position = [1,1000000000]
Output: 1
 

Constraints:

1 <= position.length <= 100
1 <= position[i] <= 10^9
*/
package Assignment;
public class MinimumCost {
    static class Solution {
        public int minCostToMoveChips(int[] position) {
            int len = position.length;
            int count;
            int index = 0;
            int cost=0;
            for(int i=index;i<len;i++){
                count = 1;
                for(int j=index+1;j<len;j++){
                    if(position[i] != position[j]){
                        break;
                    }else{
                        count++;
                    }
                }
                    if(index%2!=0){
                        cost+=count;
                    }
                    index +=count;
            }
            return cost;
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minCostToMoveChips(new int[]{2,3,3}));
    }
}