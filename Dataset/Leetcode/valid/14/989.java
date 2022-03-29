 class Solution {
    public String XXX(String[] strs) {
        int strArrLen = strs.length;
        if (strArrLen == 0) {
            return "";
        }
        if (strArrLen == 1) {
            return strs[0];
        }

        String ans = strs[0];
        for (int i = 1; i < strArrLen; i++) {
            String cur = strs[i];
            if (cur.length() == 0) {
                return "";
            }
            if (ans.length() > cur.length()) {
                ans = ans.substring(0, cur.length());
            } else {
                cur = cur.substring(0, ans.length());
            }
            for (int j = 0; j < cur.length(); j++) {
                if (cur.charAt(j) != ans.charAt(j)) {
                    ans = ans.substring(0, j);
                    break;
                }
            }
        }

        return ans;
    }
}

