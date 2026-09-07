public class Solution {

    public boolean hasDuplicate(int[] nums) {{
        Map<Integer, Integer> map = new HashMap<>();
        if (nums == null || nums.length == 0) {
            return false;
        } else if (nums.length >= 1) {
            //Solution 1 - HashMap

            /*for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    map.put(nums[i], map.get(nums[i]) + 1);
                } else {
                    map.put(nums[i], 1);
                }
            }
        }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    return true;
                }
            }
            return false;*/

            //Method 2 HashSet
            HashSet<Integer> set = new HashSet<>();
            for(int i =0; i<nums.length;i++) {
                if(!set.add(nums[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
}