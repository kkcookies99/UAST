 class Solution {
    public int XXX(String haystack, String needle) {
        int index = -1;
        if(haystack.equals("") && !needle.equals("")){
            return index;
        }else if(haystack.equals(needle) || needle.equals("")){
            return 0;
        }
        
        for(int i = 0,j = 0,start = 0;i<haystack.length();){
            if(haystack.charAt(i) == needle.charAt(start)){
                start ++;
            }else{
                start = 0;
                j++;
                i=j;
                continue;
            }
            if(start == needle.length()){
                index = j;
                break;
            }
            i++;
        }
        return index;
    }
}

