 class Solution {
    public int XXX(String s) {
    String trim = s.trim();
        if (trim.length()==0){
            return 0;
        }
        long res= 0L;
        char[] c = trim.toCharArray();
        char first = trim.charAt(0);
        if (!Character.isDigit(first)&&first!='+'&&first!='-'){
            return 0;
        }
        boolean isFu=false;
        if (first=='-'){
            isFu=true;
        }else if (Character.isDigit(first)){
            res+=first-48;
        }
        for (int i = 1; i < c.length; i++) {
            if (Character.isDigit(c[i])){
               res=res*10+c[i]-48;
               /*[−231,  231 − 1]*/
               if (res>Integer.MAX_VALUE){
                   if (isFu){
                       return Integer.MIN_VALUE;
                   }else {
                       return Integer.MAX_VALUE;
                   }
                  
               }
            }else {
                break;
            }
        }
        return (int) (isFu?(-1)*res:res);
    }
}

