 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1)
            return s;
        StringBuilder strb = new StringBuilder();
        for(int i=1;i<=numRows;i++){
            if(i == 1 || i == numRows){                
                for(int j=i-1;j<s.length();j+=2*(numRows-1)){
                    strb.append(s.charAt(j));
                }
            }
            else{
                int tag = 0;
                int j=i-1;
                while(j<s.length()){                                    
                    strb.append(s.charAt(j));
                    if(tag % 2 == 0){
                        tag++;
                        j+=2*(numRows-i);
                    }
                    else{
                        tag++;
                        j+=2*(i-1);
                    }
                }
            }
        }
        return strb.toString();
    }
}

