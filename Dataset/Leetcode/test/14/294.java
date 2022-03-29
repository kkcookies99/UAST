 class Solution {
    public String XXX(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int n = 0;
        Set set = new HashSet();
        while (true) {
            char temp = 0;
            for (int i = 0; i < strs.length; i++) {
                if (strs[i] == null || strs[i].length() == 0) {
                    return "";
                }
                if (n > strs[i].length() - 1) {
                    return strs[i];
                }
                temp = strs[i].charAt(n);
                set.add(temp);
            }
            if (set.size() > 1) {
                return strs[0].substring(0,n);
            }
            set.clear();
            n++;
        }
    }
}

