 class Solution {
    public String XXX(String s, int numRows) {
        // unique situation
        if (numRows == 1) {
            return s;
        }
        // store all line strings
        Map<Integer, StringBuilder> map = new HashMap<>();
        var arr = s.toCharArray();
        // true is up, false is down
        boolean flag = true;
        int row = 0;

        for (var ch : arr) {
            map.computeIfAbsent(row, v -> new StringBuilder()).append(ch);
            row += flag ? 1 : -1;
            if (row == numRows || row == -1) {
                flag = !flag;
                row += flag ? 2 : -2;
            }
        }

        StringBuilder res = new StringBuilder();
        // numRows will greater than map.size() maybe 
        int n = Math.min(map.size(), numRows);
        for (int i = 0; i < n; i++) {
            res.append(map.get(i));
        }

        return res.toString();
    }
}