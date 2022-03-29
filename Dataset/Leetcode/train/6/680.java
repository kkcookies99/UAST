 class Solution {
    public String XXX(String s, int numRows) {
        int len = s.length();
        // 当 numRows == 1 时，需要特值判断
        if (len == 0 || numRows == 1) return s;

        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int point = -1, flag = 1;
        for (int i = 0; i < len; i++) {
            if (point == 0) flag = 1;
            else if (point == numRows - 1) flag = -1;
            point = point + flag;
            list.get(point).append(s.charAt(i));
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            res.append(list.get(i));
        }
        return res.toString();
    }
}

