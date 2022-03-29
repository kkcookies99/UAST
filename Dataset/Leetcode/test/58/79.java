 class Solution {
    public int XXX(String s) {
        char[] s_c=s.toCharArray();
        int max=0;
        for(int i=s_c.length-1;i>=0;i--){
            if(Character.isSpace(s_c[i]) ){
                if(max>0){
                    return max;
                }
                continue;
            }
            max++;
        }
        return max;
    }
}

