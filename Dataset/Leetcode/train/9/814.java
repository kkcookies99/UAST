 class Solution {
    public boolean XXX(int x) {
        String s2 = x+"";
        int len = s2.length();
        for(int i = 0; i < len/2; i++) {
            if((len%2 == 0) && (s2.charAt(i) != s2.charAt(len - i - 1))){
                return false;
            }else if(len%2 == 1 && s2.charAt(i) != s2.charAt(len - 1 -i) ){
                return false;
        }
       
    }
     return true;
}
}

