 class Solution {
    public String XXX(String s, int numRows) {
        StringBuilder newStr = new StringBuilder();
        if(s.length() <= numRows || numRows == 1) return s;
        int flag = 1;
        for(int i = 0; i < numRows; i++){
            flag = 1;
            for(int j = i; j < s.length(); ){
                newStr.append(s.charAt(j));
                if((flag == 1 || i == 0) && i != numRows - 1 ){
                    j =  j + (numRows - i - 1) * 2;
                    flag = 0;
                }else{   
                    j =  j + i * 2;
                    flag = 1; 
                }
            }
        }

        return newStr.toString();
    }
}

