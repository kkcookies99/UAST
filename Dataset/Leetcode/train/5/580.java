 class Solution {
    public String XXX(String s) {
    if (s.length()<2) return s;
        int begin=0,maxLen=1;
        int middle=0;
        int l=0,r=0;
        for (int i = middle+1;i<s.length();i++){
            if (s.charAt(middle) == s.charAt(i)){
                if (i-middle+1>maxLen){
                    begin = middle;
                    maxLen = i-middle+1;
                }
                continue;
            }

            l = middle-1;
            r = i;
            middle=i;
            while (l>=0 && r<=s.length()-1){
                if(s.charAt(l)==s.charAt(r)){
                    if(r-l+1>maxLen) {
                        begin = l;
                        maxLen = r - l + 1;
                    }
                    l--;r++;
                }else {
                    break;
                }
            }
        }

        return s.substring(begin,begin+maxLen);
    }
}

