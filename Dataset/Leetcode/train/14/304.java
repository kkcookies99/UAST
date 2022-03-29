 class Solution {
    public String XXX(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        String min = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min.length()) {
                min = strs[i];
            }
        }
        //此时min为最短字符串
        A:
        for (int i = 0; i < min.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != min.charAt(i)) {
                    flag = false;
                    break A;
                }
            }
            if (flag) {
                res.append(min.charAt(i));
            }
        }
        return res.toString();
    }
}

