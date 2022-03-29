  public int XXX(String s) {
        s = s.trim();
        boolean isPositive =true;
        if (s.indexOf("-")==0){
            isPositive = false;
            s= s.substring(1);
        }else if(s.indexOf("+")==0){
            s = s.substring(1);
        }
        StringBuffer num = new StringBuffer();
        int index=0;Integer res = 0;
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch>=48 && ch<=57){
                if (ch == 48){
                    index++;
                }
                num.append(ch);
            }else{
                break;
            }
            if (num.length()>=10){
                if (Long.parseLong(num.toString())> Math.pow(2,31)-1){
                    res = isPositive? Integer.MAX_VALUE:Integer.MIN_VALUE;
                    return res;
                }
            }
        }
        num.substring(index);
         if (num.length()>0){
            res = isPositive?Integer.valueOf(num.toString()):Integer.valueOf(num.toString())*-1;
        }
        return res;
    }

