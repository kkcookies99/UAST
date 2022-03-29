 class Solution {
    public String XXX(String[] strs) {
        String res = "" ;
        int n = strs.length ;
        if(n==0||strs==null)return res;
        
        for(int i = 0;; i ++){
            if(i>=strs[0].length())return res;
            char t= strs[0].charAt(i);
            for(String st:strs){
                if(st.length()<=i||st.charAt(i)!=t)
                return res;
            }
            res += t;
        }
    }
}

