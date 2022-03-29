 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1)
            return s;
        
        String[] row = new String[numRows];
        Arrays.fill(row, "");
        int n = 2 * (numRows - 1);
        
        for(int i = 0; i < s.length(); i ++){
            int j = i % n;
            if(j > n / 2)    j = n - j;

            row[j] += s.charAt(i);
        }

        String res = "";
        for(String r:row) res += r;
        
        return res;
    }
}

