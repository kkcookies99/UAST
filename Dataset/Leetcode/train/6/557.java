 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1)
            return s;
        
        String[] row = new String[numRows];
        Arrays.fill(row, "");
        int j = 0, flag = 1;
        
        for(int i = 0; i < s.length(); i ++){
            row[j] += s.charAt(i);
            if(j == 0)              flag = 1;
            if(j == numRows - 1)    flag = -1;
            j += flag;
        }

        String res = "";
        for(String r:row) res += r;
        
        return res;
    }
}

