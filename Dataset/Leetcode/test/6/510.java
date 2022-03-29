 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuffer sb = new StringBuffer(s.length());
        for(int row=0; row<numRows; row++){
            int diff = Math.max(0, 2*(numRows-row-1));
            int sum = row;
            if(sum<s.length())
                sb.append(s.charAt(sum));
            while(sum<s.length()){
                if(diff==0){
                    diff = 2*(numRows-1) - diff;
                    continue;
                }
                sum = sum + diff;
                if(sum<s.length())
                    sb.append(s.charAt(sum));
                diff = 2*(numRows-1) - diff;
            }
        }
        return sb.toString();
    }
}

