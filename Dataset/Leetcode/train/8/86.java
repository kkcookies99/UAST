public int XXX(String str) {
        String s = str.trim(); 
        if(s.length() == 0)  return 0;
        if(!(s.charAt(0) == '+' || s.charAt(0) == '-' || isDig(s.charAt(0))))  return  0;
        long res = 0;
        boolean flag = false;
        if(s.charAt(0) == '-'){
            flag = true;
            s = s.substring(1,s.length());
        }
        else if(s.charAt(0) == '+')  s = s.substring(1,s.length());  //都转化为正数计算
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(!isDig(c))  break;
            res = res*10 + (c - '0');
            if(res > Integer.MAX_VALUE)  break;
        }
        if(res > Integer.MAX_VALUE) return flag ? Integer.MIN_VALUE:Integer.MAX_VALUE;
        if(res == 0) return 0;
        return flag ? -(int)res:(int)res;
    }
//判断是否为数字
    private boolean isDig(char c){
        if(c - '0' >= 0 && c - '0' <= 9)  return true;
        else return false;
    }

