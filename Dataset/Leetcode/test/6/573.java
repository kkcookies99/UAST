 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1 || s.length()<numRows){
            return s;
        }
        int width = (s.length()/(numRows+numRows-2)+1)*(numRows-1);
        Character[][] num = new Character[numRows][width];
        for(int k=0;k<s.length();k++){
            int mid=k%(numRows+numRows-2);
            int row=(mid/numRows==0)?mid:2*numRows-2-mid;
            int col=(k/(numRows+numRows-2)*(numRows-1))+((mid>(numRows-1))?mid-numRows+1 : 0);
            num[row][col]=s.charAt(k);
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<numRows;i++){
            for(int j=0;j<width;j++){
                if(num[i][j]!= null){
                str.append(num[i][j]);
                }
            }
        }
        return str.toString(); 
    }
}

