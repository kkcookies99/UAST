 class Solution {
    public String XXX(String[] strs) {
        if (strs.length == 0) return "";
        int i = 0;
        char c1, c2;
        while (true) {
            try {
                c1 = strs[0].charAt(i);
            } catch (Exception e) {
                return strs[0];
            }
            for (String str : strs) {
                try {
                    c2 = str.charAt(i);
                    if (c1 != c2) return strs[0].substring(0, i);
                } catch (Exception e) {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }
    }
}

