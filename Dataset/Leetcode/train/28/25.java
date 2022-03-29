 class Solution {
    public int XXX(String haystack, String needle) {
        int length = needle.length();
        int index = 0;
        while (index + length <= haystack.length()){
            if (needle.equals(haystack.substring(index,index+length))){
                return index;
            }
            index++;
        }
        return -1;
    }
}

