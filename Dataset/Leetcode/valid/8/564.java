 class Solution {
    public int XXX(String s) {
        int sign = 1;
        int res = 0;
        int m = s.length();
        int i = 0;
        while(i < m && s.charAt(i)==' '){
            i++;
        }
        int start = i;
        for(; i < m; i++){
            char c = s.charAt(i);
            if(i==start && c=='+'){
                sign = 1;
            }else if(i==start && c=='-'){
                sign = -1;
            }else if(Character.isDigit(c)){
                int num = c-'0';
                if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10&&num>Integer.MAX_VALUE%10)){
                    return Integer.MAX_VALUE;
                }

                if(res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10&&-num<Integer.MIN_VALUE%10)){
                    return Integer.MIN_VALUE;
                }
                res = res*10+sign*num;
            }else{
                break;
            }
        }
        return res;
    }
}

