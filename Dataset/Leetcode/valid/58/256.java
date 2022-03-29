 public int XXX(String s) {
        int res = 0;
        int len = s.length() - 1;
        // 后面的空格不计算
        while(len >= 0){
            if(s.charAt(len) != ' '){
                break;
            }
            len --;
        }
        // 从后面第一个不是空格的字母开始计算 遇到空格结束
        for(int i = len; i >= 0; i--){
            if(s.charAt(i) != ' '){
                res ++;
            }else{
                break;
            }
        }
        return res;
    }

