class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int num :  nums){
            int freq = numMap.get(num) != null ? numMap.get(num) : 0;
            numMap.put(num,  freq + 1);
        }
        Map<Integer, Integer> sortedMap =  numMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (oldValue, newValue) -> oldValue,
                LinkedHashMap::new
        ));
    int[] result = new int[k];
    int i = 0;
    for (int key : sortedMap.keySet()) {
    if (i >= k) break;
    result[i++] = key;
    }
    return result;
        
    }
}
