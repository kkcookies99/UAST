 class Solution {
    public int XXX(String haystack, String needle) {
        int[] next = getNext(needle);
        int i = 0;
        int j = 0;
        while(i < haystack.length() && j < needle.length()){
            if(j==-1 || haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else{
                j = next[j];
            }
        }
        return j < needle.length()?-1:i-j;
    }
    public int[] getNext(String str){
        int[] next = new int[str.length()+1];
        next[0] = -1;
        int i = 0;
        int j = -1;
        while(i < str.length()-1){
            if(j == -1 || str.charAt(i) == str.charAt(j)){
                ++i;
                ++j;
                if(str.charAt(i) != str.charAt(j)){
                    next[i] = j;

                }else{
                    next[i] = next[j];
                }
                
            }else j = next[j];
        }
        return next;
    }
}

