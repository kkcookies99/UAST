 class Solution {
    public int XXX(String s) {
        int len=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ') len++;
            else if(len>0) break;
        }
        return len;
    }
}

