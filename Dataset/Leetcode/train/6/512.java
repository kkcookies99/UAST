 class Solution {
    public String XXX(String s, int numRows) {
        if(s == null || s.length() == 0) return "";
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        int i = 0; 
        while(i < s.length()) {
            // 往下走
            for(int j = 0; i < s.length() && j < numRows; j ++) {
                sb[j].append(s.charAt(i++));
            }
            // 往上走
            for(int j = numRows - 2; i < s.length() && j > 0; j--) {
                sb[j].append(s.charAt(i++));
            }
        }
        
        StringBuilder ret = new StringBuilder();
        for(i = 0; i < numRows; i++) {
            ret.append(sb[i]);   
        }
        return ret.toString();
    }
}


