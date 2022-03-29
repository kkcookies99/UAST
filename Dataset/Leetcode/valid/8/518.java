   public int XXX(String s) {
        s = s.trim();
        if(s.length() == 0){
            return 0;
        }
        char ch = s.charAt(0);
        if(ch != '+' && ch != '-' && !(ch >= '0' && ch <= '9')){
            return 0;
        }
        int flag = 1;
        if (ch == '-') {
            flag = -1;
        }
        if (ch == '-' || ch == '+') {
            s = s.substring(1);
        }
        String res = "";
        while(s.length() > 0){
            ch = s.charAt(0);
            if(ch < '0' || ch > '9'){
                break;
            }
            res = res + ch;
            s = s.substring(1);
        }
        if(res.length() == 0){
            return 0;
        }
        if(flag == -1){
            res = '-' + res;
        }
        try{
            return Integer.valueOf(res);
        }catch(Exception e){
            if(flag == 1){
                return Integer.MAX_VALUE;
            }
            return Integer.MIN_VALUE;
        }
    }

