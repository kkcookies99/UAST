class Solution {
    public int XXX(String s) {
        if(s.length()==0)return 0;
        else if(s.length()==1)return 1;
        char s1[] = s.toCharArray();
        if(s1.length==2){
            if(s1[0]==s1[1])return 1;
            return 2;
        }
        int l = 0;
        int r = 0;
        int max = 0;
        int length = 0;
        while(r<s1.length){
            r++;
            if(r>=s1.length)break;
            if(s1[l] == s1[r]){
                l++;     
            }
            if(r>=s1.length)break;
            for(int i=l+1;i<r;i++){
                if(s1[i]==s1[r]){
                    l=i+1;
                }
            }
            length = r-l+1;
            max = (length>max)?length:max;
        }
        return max;
    }
}

