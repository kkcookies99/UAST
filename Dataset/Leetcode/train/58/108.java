 class Solution {
    public int XXX(String s) {
        int len = s.length();
        if(len == 0){ return 0; }
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                return len-1 - i;
            }
        }
        return len;
    }
}

