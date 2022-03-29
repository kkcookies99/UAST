 class Solution {
    public String XXX(String s) {
      int len=s.length();
        if (len==1) return s;
        int maxlen=1;
        int start=0;
        int left=0,right=0;
        for (int i = 0; i < len; i++) {
            int currentLength=1;
            left=i-1;
            right=i+1;
            while (left>=0 && s.charAt(left)==s.charAt(i)){
                left--;
                currentLength++;
            }
            while (right<len && s.charAt(right)==s.charAt(i)){
                right++;
                currentLength++;
            }
            while (left>=0 && right<len && s.charAt(right)==s.charAt(left)){
                left--;
                right++;
                currentLength+=2;
            }
            if (currentLength>maxlen){
                maxlen=currentLength;
                start=left+1;
            }
        }
        return s.substring(start,start+maxlen);
    }
}

