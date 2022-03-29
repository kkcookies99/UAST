 public String XXX(String s, int numRows) {
    String res = "";
    if (numRows == 1) return s;
    for (int i = 0; i < numRows; i++){
        if (i == 0 || i == numRows - 1){
            for (int j = i; j < s.length(); j += (2 * numRows - 2)){
                res += s.substring(j, j+1);
            }
        }
        else{
            int count = 0;
            for (int j = i; j < s.length(); ){
                res += s.substring(j, j+1);
                if(count % 2 == 0){
                    j += 2 * numRows - 2 - 2 * i;                       
                }
                else{
                    j += 2 * i;
                }
                count++;
            }
        }
    }
    return res;
}

