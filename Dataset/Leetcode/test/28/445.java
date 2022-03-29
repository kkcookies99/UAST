 class Solution {
    public int XXX(String haystack, String needle) {
        int needleLength=needle.length();
        for(int i=0;i<haystack.length()-needleLength+1;i++){
           String partstring=haystack.substring(i,i+needleLength);
           if(partstring.equals(needle)){
               return i;
           }
        }    
        return -1;
    }
}

