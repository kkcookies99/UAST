 class Solution {
    public int XXX(String haystack, String needle) {
        int len1 = haystack.length(),len2 = needle.length();
        if(needle.equals("")){
            return 0;
        }
        Map<String,Integer> map = new HashMap<>();
        map.put(needle,0);
        for(int i=0;i<len1-len2+1;i++){
            String s = haystack.substring(i,i+len2);
            if(map.containsKey(s)){
                return i;
            }
        }
        return -1;
    }
}

