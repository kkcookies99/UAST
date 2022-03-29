 class Solution {
    public int XXX(String s) {
        char[] c = s.toCharArray();
        int res = 0;
        for (int i=c.length-1;i>=0;i--){
            if (c[i] != 32){
                res++;
            }else if(c[i] == 32 && res != 0){
                return res;
            }
        } 
        return res;
    }
}

