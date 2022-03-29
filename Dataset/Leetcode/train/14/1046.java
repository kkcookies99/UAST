 class Solution {
    public String XXX(String[] strs) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; true; i++) {
            char c;
            if (strs[0].length() > i) {
                c = strs[0].charAt(i);
            } else return builder.toString();
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() > i) {
                    if (c != strs[j].charAt(i)) return builder.toString();
                } else return builder.toString();
            }
            builder.append(c);
        }
    }
}

