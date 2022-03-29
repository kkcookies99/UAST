 class Solution {
    public int XXX(String haystack, String needle) {
        int lenL = haystack.length(),lenR = needle.length();
        if(lenR==0)
            return 0;
        if(lenL==0)
            return -1;
        int pos = -1;
        int L=0,R=0;
        while(L<lenL){
            //System.out.println(L+" "+R+" "+pos);
            if(haystack.charAt(L)==needle.charAt(R)){
                R++;
                if(pos==-1){
                    pos=L;
                }
            }
            else{
                if(R>=lenR){
                    return pos;
                }
                if(pos>=0){
                    L=pos+1;
                    R=0;
                    pos=-1;
                    continue;
                }
            }
            if(R>=lenR){
                return pos;
            }
            if(pos==-1){
                R=0;
            }
            L++;
        }
        if(R>=lenR)
            return pos;
        return -1;
    }
}

