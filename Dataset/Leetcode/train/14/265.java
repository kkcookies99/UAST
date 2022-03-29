 class Solution {
    public String XXX(String[] strs) {
        int i;
        for (i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return new StringBuilder(strs[0]).substring(0, i);
                }
            }
        }
        return new StringBuilder(strs[0]).substring(0, i);
    }
}