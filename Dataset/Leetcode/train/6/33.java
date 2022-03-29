 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder sb = new StringBuilder();
        int a = 2*numRows-2;
        for(int j=0;j<numRows;j++){
            for(int i=0;i<s.length();i++){
                int mode = i%a;
                if(mode==j || mode==a-j) sb.append(s.charAt(i));
            }
        }        
        return sb.toString();
    }
}

