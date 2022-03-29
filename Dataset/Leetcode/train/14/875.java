     public String XXX(String[] strs) {
        int c = 0, n = strs[0].length();
        
        for (int i = 1; i < strs.length; i++) {
            n = Math.min(strs[i].length(), n);
        }
        while (c < n) {
            char cha = strs[0].charAt(c);
            boolean f = true;
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(c) != cha) {
                    f = false;
                    break;
                }
            }
            if (f) c++;
            else break;
        }

        return strs[0].substring(0, c);
    }

