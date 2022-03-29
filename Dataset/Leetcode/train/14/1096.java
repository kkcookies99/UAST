 class Solution {
    public String XXX(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        for (int i = 0; ; i++) {
            char common = '\0';
            for (String str : strs) {
                if (i < str.length()) {
                    if (common == '\0') {
                        common = str.charAt(i);
                    }
                    if (str.charAt(i) != common) {
                        return i == 0 ? "" : str.substring(0, i);
                    }
                } else {
                    return str.substring(0, i);
                }
            }
            common = '\0';
        }
    }
}

