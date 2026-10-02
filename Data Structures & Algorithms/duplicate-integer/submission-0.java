class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num : nums){
            if(countMap.containsKey(num))
                return true;
            else
                countMap.putIfAbsent(num, 1);
        }
        return false;
    }
}