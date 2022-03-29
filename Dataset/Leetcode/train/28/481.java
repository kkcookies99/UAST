 class Solution {
    public int XXX(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        if(needle.length() == 0){
            return 0;
        }
        int[] next = new int[needle.length()];
        next[0] = -1;
        int j = 0, k = -1;
        while(j < needle.length() - 1){
            if(k == -1 || needle.charAt(j) == needle.charAt(k)){
                if(needle.charAt(++j) == needle.charAt(++k)){
                    next[j] = next[k];
                }else{
                    next[j] = k;
                }
            }else{
                k = next[k];
            }
        }
        j = 0;
        k = 0;
        while(j < haystack.length() && k < needle.length()){
            if(k == -1 || haystack.charAt(j) == needle.charAt(k)){
                j++;
                k++;
            }else{
                k = next[k];
            }
        }
        if(k == needle.length()){
            return j - k;
        }else{
            return -1;
        }
    }
}

