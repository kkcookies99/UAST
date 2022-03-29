 public String XXX(String s, int numRows) {
         if(numRows==1){
             return s;
         }
        char[] chars = s.toCharArray();
        StringBuilder result= new StringBuilder();
         int count;
        for(int i=0;i<numRows;i++){
            count=i;
            boolean flag=false;
            while (true) {
                int base;
                if (i==0||i==numRows-1){base=2+(numRows - 2) * 2;}
                else {
                    if (!flag){
                    base = 2 + (numRows - 2 - i) * 2;}
                    else {base=2+(numRows-(numRows-i+1))*2;}
                }
                if (count>=chars.length){break;}
                result.append(chars[count]);
               count+=base;
                flag=!flag;
            }
        }
        return result.toString();
    }

