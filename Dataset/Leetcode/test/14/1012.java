     public String XXX(String[] strs) {
        if (strs.length == 0 || strs.length == 1) {
            return strs.length == 0 ? "" : strs[0];
        }
        // 固定第一个
        int i = 0;
        for (; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return new String(strs[0].toCharArray(), 0, i);
                }
            }
        }
        return new String(strs[0].toCharArray(), 0, i);
    }

