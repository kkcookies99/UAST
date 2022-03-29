 public String XXX(String[] strs) {
        if (strs==null||strs.length==0) return null;
        String temp=strs[0];
        int len=temp.length();
        for (int i = 1; i <strs.length ; i++) {
            String tt=strs[i];
            for (int j = 0; j <tt.length()&&j<len ; j++) {
                if (tt.charAt(j)!=temp.charAt(j)){
                    len=j;
                    break;
                }  
            }
            len=Math.min(len,tt.length());
        }
        return temp.substring(0,len);
    }

