 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<numRows;i++){
            int temp = 0;
            for (int j=i;j<cs.length;){
                if (i==0||i==numRows-1){
                    sb.append(cs[j]);
                    j+=2*(numRows-1);
                }
                else {
                    if(temp==0){
                        sb.append(cs[j]);
                        j += (numRows-i-1)*2;
                        temp=1;
                    }
                    else {
                        sb.append(cs[j]);
                        j += (i)*2;
                        temp=0;
                    }
                }
            }
        }
        return sb.toString();
    }
}

