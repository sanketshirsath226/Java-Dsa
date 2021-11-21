package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GivenOrder {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4 };
        int[] ind = { 0, 1, 2, 2, 1 };
        System.out.println(Arrays.toString(createTargetArray(arr, ind)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
