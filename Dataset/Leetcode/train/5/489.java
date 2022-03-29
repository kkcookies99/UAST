 class Solution {
    public String XXX(String s) {
        if(s.length() == 1){
            return s;
        }
        String res = "";
        for(int i = 0 ; i < s.length() ; i++){
            String tmp = getPalLength(s,i);
            if(tmp.length() > res.length()){
                res = tmp;
            }
        }

        return res;
    }

    public String getPalLength(String s,int index){
        if(index == 0 ){
            return s.charAt(index)+"";
        }

        // 两种扩散方式
        int l = index - 1;
        int r = index + 1;
        int len1 = 1;

        while(l >= 0 && r <= s.length() - 1 && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
            len1 += 2;
        }
        String res1 = s.substring(l+1,r);

        l = index -1;
        r = index;
        int len2 = 0;
        if(s.charAt(l) != s.charAt(r)){
            return res1;
        }

        while(l>=0 && r<= s.length() -1 && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
            len2 += 2;
        }
        String res2 = s.substring(l+1,r);

        return len1 > len2 ? res1 : res2;
    }
}

