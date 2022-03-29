 class Solution {
    public int XXX(String s) {
        int sign = 1;
        int res = 0;
        int i = 0;
        while(i < s.length() && s.charAt(i)==' '){
            i++;
        }
        int start = i;
        for(; i < s.length(); i++){
            if(i==start && s.charAt(i)=='+'){
                sign = 1;
            }else if(i==start && s.charAt(i)=='-'){
                sign = -1;
            }else if(Character.isDigit(s.charAt(i))){
                int num = s.charAt(i)-'0';
                res = res*10+sign*num;
                if(res==-20){
                    return Integer.MAX_VALUE;
                }
                if(res%10!=sign*num){
                    if(sign==1){
                        return Integer.MAX_VALUE;
                    }else{
                        return Integer.MIN_VALUE;
                    }
                }
            }else{
                break;
            }
        }
        return res;
    }
}

