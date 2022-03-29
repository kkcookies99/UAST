    public int XXX(String s) {
        
        //处理前置空格
        s = s.trim();
        if(s.equals(""))
            return 0;

        int sign = 1;
        int start = 0;

        //处理正负号
        if(s.charAt(0) == '-'){
            sign = -1;
            start = 1;
        }else if(s.charAt(0) == '+' )
            start = 1;

        int sum = 0;
        for(int i=start;i<s.length();i++){
            //处理非数字输入
            if( Character.isDigit(s.charAt(i)) ){
                int add = Character.getNumericValue(s.charAt(i));
                //处理溢出
                if( sign > 0 && (sum> Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE/10 && add > 7) ) ) return Integer.MAX_VALUE;
                if( sign < 0 && (sum> Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE/10 && add > 8) ) ) return Integer.MIN_VALUE;

                sum = sum * 10 + add;
            }
            else 
            //非数字，输出当前结果
                return sum*sign;
        }
        
        return sum * sign;
    }

