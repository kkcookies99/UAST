 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1) return s;
        int iv = numRows*2 - 2;
        StringBuilder sb = new StringBuilder();
        for(int r = 0; r < numRows; ++ r) {
            for(int i = 0; i < s.length(); ++ i) {
                if(i%iv == r || i%iv == (iv-r)) {
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}