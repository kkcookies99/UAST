 class Solution {
    public int XXX(String haystack, String needle) {
     if(needle.length()==0 || haystack.equals(needle)){
         return 0;
     }
     String[] split = haystack.split(needle);
     if(split.length==0){
         return 0;
     }
     if(split[0].equals(haystack)){
         return -1;
     }
     return split[0].length();
    }
}

