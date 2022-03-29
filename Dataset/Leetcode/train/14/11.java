 class Solution {
    public String XXX(String[] strs) {
        if (strs.length == 0) return "";
        String result = strs[0];
        if (strs.length == 1) return strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
                i--;
            }
        }

        return result;
    }
}

