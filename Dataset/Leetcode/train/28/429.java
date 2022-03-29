 class Solution {
    public int XXX(String haystack, String needle) {
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
       
        if((haystack.equals("")&&needle.equals(""))||needle.equals("")){
            return 0;
        }
        int nl = needle.length();
        int hl = haystack.length();
        boolean que = false;
        for(int i = 0;i < nl;i++){
            for(int j = 0;j < hl;j++){
                if(hl-j<nl){
                    break;
                }
                if(n[i]==h[j]){
                    for(int k = 0;k < nl;k++){
                        if(n[k]!=h[j+k]){
                            que = false;
                            break;
                        }
                        que = true;
                    }
                    if(que == true){
                        return j;
                    }  
                }
            }
        }
        return -1;
    }
}

