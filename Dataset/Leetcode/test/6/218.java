 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1) return s;
        int y_pos = 0, y_offsets = 1; // 模拟从上往下, 从下往上的过程
        StringBuilder[] resultant = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) resultant[i] = new StringBuilder();
        for(char c : s.toCharArray()){
            resultant[y_pos].append(c); 
            if(y_pos + y_offsets < 0 || y_pos + y_offsets >= numRows)
                y_offsets = ~y_offsets + 1;
            y_pos += y_offsets;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder sj : resultant) result.append(sj.toString());
        return result.toString();
    }
}


