 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        if(needle.length() > haystack.length()){
            return -1;
        }
        int length = needle.length();
        int index = 0;
        while(index + length <= haystack.length()){
            if(needle.equals(haystack.substring(index , index+length))){
                return index;
            }
            index++;
        }
        return -1;
    }
}

