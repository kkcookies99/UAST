 class Solution {
    public int XXX(String s) {
        int flag = 1;//正数
        int i = 0;
        //去掉空格
        while(i < s.length()){
            if(s.charAt(i) != ' '){
                break;
            }
            i++;
        }
        if(i == s.length()){
            return 0;
        }
       //检查符号
        if(s.charAt(i) == '-'){
            flag *= -1;
            i++;
        }else if(s.charAt(i) == '+'){
            i++;
        }
        if(i == s.length()){
            return 0;
        }

        //数字处理，注意是否溢出
        int res = 0;
        for(; i < s.length(); i++){
            int p = s.charAt(i) - '0';
            if(p >= 0 && p <= 9){
                if(res > Integer.MAX_VALUE / 10){
                    if(flag == 1)
                        return Integer.MAX_VALUE;
                    else
                        return Integer.MIN_VALUE;
                }
                if(res == Integer.MAX_VALUE / 10){
                    if(flag == 1 && p > 7)
                        return Integer.MAX_VALUE;
                    if(flag == -1 && p > 8)
                        return Integer.MIN_VALUE;
                }
                    
                res = res * 10 + p;
            }else{
                break;
            }          
        }


        return res * flag;
    }
}

