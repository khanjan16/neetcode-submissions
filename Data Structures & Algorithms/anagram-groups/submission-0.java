class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        HashMap<String, List<String>> stringMap = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String tempStr = new String(chars);
            List<String> tempList = stringMap.get(tempStr) != null ? stringMap.get(tempStr) : new ArrayList<String>();
            tempList.add(str);
            stringMap.put(tempStr, tempList);
        }

        for(List<String> strList : stringMap.values()){
            resultList.add(strList);
        }
        return resultList;
    }
}
