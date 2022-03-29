 public String XXX(String[] strs) {
        if (strs.length > 0) {
            boolean flag = false;
            for (int i = 0; i < strs[0].length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    if (i< strs[j].length() && strs[0].charAt(i) == strs[j].charAt(i)) {
                        continue;
                    }
                    flag = true;
                }
                if (flag) {
                    return strs[0].substring(0, i);
                }
            }
            return strs[0];
        }  else {
            return "";
        }
    }

