 class Solution {
    public String XXX(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder ans = new StringBuilder("");
        for (int j = 0; j < strs[0].length(); ++j) {
            char k = strs[0].charAt(j);
            for (String str : strs) {
                if (str.length() <= j || str.charAt(j) != k)
                    return ans.toString();
            }
            ans.append(k);
        }
        return ans.toString();
    }
}

