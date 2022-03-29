 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1) return s;
        else{
            char[][] c = new char[numRows][s.length()];
            int row = 0;
            for(int i=0; i<s.length(); i++){
                row = i%(2*numRows-2)>numRows-1 ? (2*numRows-2)-i%(2*numRows-2) : i%(2*numRows-2);
                c[row][i] = s.charAt(i);
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<numRows; i++){
                for(int j=0; j<s.length(); j++){
                    if(c[i][j]!='\0') sb.append(c[i][j]);
                }
            }
            return sb.toString();
        }
    }
}

