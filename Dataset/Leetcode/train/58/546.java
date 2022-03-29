class Solution {
    public int XXX(String s) {
 
        char[] chars = s.toCharArray();
        int res=0;
        for (int i =s.toCharArray().length-1; i >=0; i--) {
            if (chars[i]!=' '){
                res++;
                continue;
            }
            if (chars[i]==' ' &&res>0){
                return res;
            }
        }
        return res;
    }
}

