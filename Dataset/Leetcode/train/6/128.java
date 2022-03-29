 class Solution {
    public String XXX(String s, int numRows) {     
        if(1==numRows){return s;}
        StringBuilder sb =new StringBuilder();
        int i = (numRows -1)* 2;
        char[] chars = s.toCharArray();
        for(int x=0;x<numRows;x++){
            for(int index=x;index<chars.length;index=index+i){
                sb.append(chars[index]);
                if(x>0&&x<numRows-1){
                    int i1 = index + (numRows - 1 - x) * 2;
                    if(i1<chars.length){
                        sb.append(chars[i1]);
                    }
                }
            }
        }
        return sb.toString();
    }
}

