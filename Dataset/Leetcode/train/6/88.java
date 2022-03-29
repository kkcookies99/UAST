 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows==1){
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int j=0;j<numRows;j++){
            for (int i=0;i<s.length();i++){
                if (i%(2*numRows-2)==j||i%(2*numRows-2)==(2*numRows-2-j)){
                    stringBuilder.append(s.charAt(i));
                }
            }
        }
        return stringBuilder.toString();
    }
}

