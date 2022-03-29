    public int XXX(String s) {
        int n = s.length();
        int i = 0;
        while(('0' > s.charAt(i) || s.charAt(i) > '9') && i < n && s.charAt(i) != '-'){
            i++;
        }
        long flag = 1;
        if(s.charAt(i) == '-'){
            flag = -1;
            i++;
        }
        StringBuffer sb = new StringBuffer();
        while(i<n && ('0' <= s.charAt(i) && s.charAt(i) <= '9')){
            sb.append(s.charAt(i));
            i++;
        }
        Long res = flag * Long.valueOf(sb.toString());
        if(res >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(res <= Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else{
            return Integer.parseInt(String.valueOf(res));
        }
    }

