package A_may.ex_28052024_CollectionFrameWork;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {5,4,1, 8};
        int target = 9;
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                System.out.println("Output: [" + numMap.get(complement) + ", " + i + "]");
                return;
            }
            numMap.put(nums[i], i);
        }

        System.out.println("No two sum solution.");
    }
}
