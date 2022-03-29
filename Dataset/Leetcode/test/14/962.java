 public String XXX(String[] strs) {
        if(strs.length <= 1) return strs[0];
        int i = 0;
        while (i <= 200) {
            for(int j = 1; j < strs.length; j++) {
                if(i < strs[0].length()) {
                    char str0 = strs[0].charAt(i);
                    if (i >= strs[j].length() || strs[j].charAt(i) != str0) {
                        return strs[0].substring(0, i);
                    }
                } else {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }
        return "";
    }

