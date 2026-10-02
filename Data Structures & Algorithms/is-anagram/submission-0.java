class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1array = s.toCharArray();
        char[] s2array = t.toCharArray();

        if(s1array.length != s2array.length)
            return false;
        
        Arrays.sort(s1array);
        Arrays.sort(s2array);

        for(int i = 0 ; i < s1array.length; i++){
            if(s1array[i] != s2array[i])
                return false;
        }
        return true;
    }
}
