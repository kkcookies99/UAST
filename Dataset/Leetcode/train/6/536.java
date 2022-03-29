 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int bi = (2 * numRows - 2);
        for(int i = 1; i <= Math.min(numRows, s.length()); i++){
            int k = (s.length() - i) / bi;
            for(int j = 0; j <= k; j++){
                if(j > 0 && i != 1 && i != numRows){
                    sb.append(s.charAt(i + j * bi - 2 * i + 1));
                }
                sb.append(s.charAt(i + j * bi - 1));
            }
            if(i != 1 && i != numRows && i + (k + 1) * bi - 2 * i + 1 < s.length()){
                sb.append(s.charAt(i + (k + 1) * bi - 2 * i + 1));
            }
        }
        return sb.toString();
    }
}

