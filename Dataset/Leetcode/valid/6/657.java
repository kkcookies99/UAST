 public String XXX(String s, int numRows) {
        if(s.length() == 1) return s;
        ArrayList<StringBuffer> list = new ArrayList<StringBuffer>();
        String res = "";
        for(int i = 0; i <numRows; i++){
            list.add(new StringBuffer());
        }
        StringBuffer sbf ;
        int k = 0;
        for(int i = 0; i < s.length(); i++){
            if(numRows  == 1){
                k = 0;
            }else{
                k = i%(2 * numRows - 2);
            }
            if(k <= numRows - 1){
                sbf = list.get(k);
                sbf.append(s.charAt(i));
            }else{
                sbf = list.get(2 * numRows - 2 - k);
                sbf.append(s.charAt(i));
            }
        }
        for(int i = 0; i <numRows; i++){
            res += list.get(i);
        }
        return res;
    }

