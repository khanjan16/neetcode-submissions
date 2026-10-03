class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "" ;
        StringBuilder sb = new StringBuilder();
        String delim = "#";
        for(String str : strs){
            int size = str.length();
            sb.append(size).append(delim).append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
    
    List<String> result =  new ArrayList<>();
     if (str.length() == 0) {
            return result;
    }
    int i = 0;
    // Base the loop condition on the main reading pointer 'i'
    while (i < str.length()) {
        // Dynamically find the next '#' starting from position i
        int j = str.indexOf('#', i); 
        
        int size = Integer.parseInt(str.substring(i, j));
        result.add(str.substring(j + 1, j + 1 + size));
        
        // Move i directly to the start of the next length prefix
        i = j + 1 + size; 
    }
    return result;
}
}
