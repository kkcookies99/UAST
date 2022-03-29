 public String XXX(String s, int numRows) {
        int length = s.length();
        if(length <= numRows || numRows == 1) return s;
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<numRows; i++){
            int j = i;
            int num = 1;
            boolean flag = true;
            while(j<length){
                if(num>0) sb.append(s.charAt(j));
                if(flag){
                    num = (numRows-1-i)*2-1;
                    flag = false;
                }else{
                    num = i*2-1;
                    flag = true;
                }
                if(num>0) j = j+num+1;
            }
        }
        return sb.toString();
    }

