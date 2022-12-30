/*
1773. Count Items Matching a Rule
Easy

1319

139

Add to List

Share
You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

 

Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1

Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
Example 2:

Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
 

Constraints:

1 <= items.length <= 104
1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
ruleKey is equal to either "type", "color", or "name".
All strings consist only of lowercase letters.
*/
import java.util.List;
import java.util.ArrayList;
class CountingItemMatchingRule{
    public static void main(String args[]){
        List<String> list = new ArrayList<String>();
        list.add("phone");
        list.add("blue");
        list.add("pixel");
        
        List<List<String>> list2 = new ArrayList<List<String>>();
        list2.add(list);

        System.out.println(countMatches(list2,"type","phone"));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = columnNo(ruleKey);
        int count=0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
    public static int columnNo(String ruleKey){
        switch(ruleKey){
            case "type": return 0;
            case "color" : return 1;
            case "name" : return 2;
         }
        return -1;
    }
}