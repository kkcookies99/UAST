 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows <= 1) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) rows[i] = new StringBuilder();//StringBuilder数组使用前必须初始化
        char[] sArray = s.toCharArray();
        boolean reverse = true;//行号是否逆序(下面第一次会将其变为false)
        int row = 0;
        for(int i = 0; i < s.length(); i++){
            rows[row].append(sArray[i]);
            if(row == 0 || row == numRows-1) reverse = !reverse;
            if(reverse) row--;
            else if(!reverse) row++;
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < numRows; i++) res.append(rows[i]);
        return res.toString();
    }
}

