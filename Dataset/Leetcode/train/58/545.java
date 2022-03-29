class Solution {
    public int XXX(String s) {
        int i, n=0;
        for(i=s.length()-1; i>=0; i--)
            if(s.charAt(i) == ' '){
                continue;
            }else{
                n++;
                if(i==0 || (i-1)>=0&&s.charAt((i-1)) == ' ')
                    break;
            }
        return n;
    }
}

