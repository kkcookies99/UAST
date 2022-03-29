     public int XXX(String s) {
        s = s.trim();
        if (s.length() == 0){
            return 0;
        }
        int i = 0;
        int n = s.length();
        //字母开头
        if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != '-' && s.charAt(i) != '+'){
            return 0;
        }
        //正负号开头，只能有一个且在最前面
        // 0表示没有正负号， 1表示正， 2表示负号
        int flag = 0;
        if (s.charAt(i) == '+'){
            flag = 1;
            i++;
        }else if (s.charAt(i) == '-'){
            flag = 2;
            i++;
        }
        long res = 0L;
        while (i < n && Character.isDigit(s.charAt(i))){
            res = res * 10 + s.charAt(i) - '0';
            i++;
            //判断是否超出范围
            if (flag == 2 && res*-1 < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            if (flag != 2 && res > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
        }
        //遍历到不是数字了
        //空格 字母 小数点
        if (i == n || s.charAt(i) == ' ' || s.charAt(i) == '.' || Character.isLetter(s.charAt(i))){
            return flag != 2 ? (int)res: (int)res * -1;
        }else {
            //正负号
            if (res > 0 &&( s.charAt(i) == '+' || s.charAt(i) == '-')){
                return flag != 2 ? (int)res: (int)res * -1;
            }
            return 0;
        }
    }

