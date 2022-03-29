 class Solution {
    public String XXX(String s) {
        int len = s.length();
        if(len<=1) return s;
        int i=0;
        String res ="";
        while(i<len){
            if((len-i)<res.length()/2) break;
            int left =i,right =i;
            while(right<len-1&&s.charAt(right)==s.charAt(right+1))
                right++;
            i=right+1;
            while(left>0&&right<len-1&&s.charAt(left-1)==s.charAt(right+1)){
                left--;
                right++;
            }
            if(res.length()<right-left+1) res = s.substring(left,right+1);
        }
        return res;
    }
}

