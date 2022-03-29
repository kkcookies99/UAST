 class Solution {
    public String XXX(String[] strs) {
        int n = strs.length;
        if (n == 0) return "";
        String base = strs[0];
        for (int i = base.length(); i > 0; i--) {
            String t = base.substring(0, i);
            boolean flag = true;
            // 检查是否是公共前缀
            for (String s : strs) {
                if (s.length() < i || !s.startsWith(t)) {
                    flag = false;
                    break;
                }
            }
            if (flag) return t;
        }
        return "";
    }
}

