 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder[] strArr = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            strArr[i] = new StringBuilder();
        }
        boolean down = true;
        int index = 0;
        for(char c : s.toCharArray()){
            if(index < numRows-1 && down){
                strArr[index].append(c);
                index++;
            }else if(index == numRows-1){
                strArr[index].append(c);
                index--;
                down = false;
            }else if(index > 0 && !down){
                strArr[index].append(c);
                index--;
            }else if(index == 0){
                strArr[index].append(c);
                index++;
                down = true;
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<numRows;i++){
            res.append(strArr[i].toString());
        }
        return res.toString();
    }
}

