 class Solution {
    public String XXX(int n) {
        if( n == 1) {
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        int temp = 1;
        String str = "1";
        while(n>1){
            sb.delete(0,sb.length());
            char[] s = str.toCharArray();
            for(int i = 0; i < s.length; i ++){
                if(i<s.length-1 && s[i] == s[i+1]){
                    temp++;
                }else{
                    sb.append(temp).append(s[i]);
                    temp = 1;
                }
            }
            str = sb.toString();
            n --;
        }
        return sb.toString();
    }
}

