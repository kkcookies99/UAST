 class Solution {
    public String XXX(String s, int numRows) {
        // 边界情况
        if (numRows==1) return s;

        // 初始化 StringBuilder 数组， 每行用一个StringBuilder记录
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i=0;i<numRows;i++) {
            sbs[i] = new StringBuilder();
        }

        // row表示行，i表示字符串位置
        int row  = 0;
        int i = 0;
        while (i<s.length()) {
            while (row < numRows-1 && i<s.length()) {
                sbs[row++].append(s.charAt(i++));
            }
            while (row > 0 && i<s.length()) {
                sbs[row--].append(s.charAt(i++));
            }
        }

        // 最后用一个StringBuilder汇总
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb: sbs) {
            res.append(sb);
        }
        return res.toString();
        
    }
}

