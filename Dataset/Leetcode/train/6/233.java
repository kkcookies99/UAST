 public String XXX(String s, int numRows) {
    StringBuilder[] sbs = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++) {
        // 每一行放进一个字符串中最后再合并
        sbs[i] = new StringBuilder();
    }
    for (int si = 0; si < s.length(); ) {
        // 先下降
        for (int i = 0; i < numRows && si < s.length(); i++) {
            sbs[i].append(s.charAt(si++));
        }
        // 再上升
        for (int i = numRows - 2; i > 0 && si < s.length(); i--) {
            sbs[i].append(s.charAt(si++));
        }
    }
    StringBuilder ans = new StringBuilder();
    for (StringBuilder sb : sbs) {
        ans.append(sb);
    }
    return ans.toString();
}

