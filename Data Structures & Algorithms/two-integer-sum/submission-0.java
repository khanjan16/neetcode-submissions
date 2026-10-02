class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int reamining = target - nums[i];
            if (numMap.containsKey(reamining)) {
                return new int[]{numMap.get(reamining), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
