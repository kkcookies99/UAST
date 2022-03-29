 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int a = 2 * (numRows - 1);
        for (int i = 0; i < numRows; i++) {
            int c = i;
            if(i==0||i==numRows-1){
                while (c<s.length()){
                    sb.append(s.charAt(c));
                    c = c + a;
                }
            }else {
                int b = a-2*i;
                while (c < s.length()) {
                    sb.append(s.charAt(c));
                    c = c + b;
                    b = a - b;
                }
            }
        }
        return sb.toString();
    }
}

