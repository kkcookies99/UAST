 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows){
            return s;
        }
        int max = s.length()/(2*numRows-2);
        StringBuilder str = new StringBuilder();
        for(int i=0;i<numRows;i++){
            int k=0;
            for(;k<max;k++){
                str.append(s.charAt(k*(2*numRows-2)+i));
                if(i!=0 && i!=numRows-1){
                str.append(s.charAt(k*(2*numRows-2)+(2*numRows-2)-i));
                }
            }
            if(k*(2*numRows-2)+i<s.length()){
                str.append(s.charAt(k*(2*numRows-2)+i));
            }
            if(i!=0 && i!=numRows-1 && k*(2*numRows-2)+(2*numRows-2)-i<s.length()){
                str.append(s.charAt(k*(2*numRows-2)+(2*numRows-2)-i));
            }
        }
        return str.toString();
    }
}

