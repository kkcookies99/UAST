 class Solution {
    public String XXX(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        return XXX(strs, strs[0]);
    }

    private String XXX(String[] strs, String res) {
        if (allItemContain(strs, res)) {
            return res;
        }
        return XXX(strs, res.substring(0, res.length() - 1));
    }

    private boolean allItemContain(String[] strs, String str) {
        for (String s : strs) {
            if (!s.startsWith(str)) {
                return false;
            }
        }
        return true;
    }

}