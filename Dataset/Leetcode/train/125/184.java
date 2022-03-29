 public boolean XXX(String s) {
        String upperStr = s.toUpperCase();
        int l = 0;
        int r = s.length() - 1;
        // 数字 48-57 65-90
        while (r > l) {
            char lc = upperStr.charAt(l);
            // 如果不是数字或者大写字母， 下一位
            while ((lc < 48 || (lc > 57 && lc < 65) || lc > 90) && r > l) {
                l++;
                lc = upperStr.charAt(l);
            }
            char rc = upperStr.charAt(r);
            while ((rc < 48 || (rc > 57 && rc < 65) || rc > 90) && r > l) {
                r--;
                rc = upperStr.charAt(r);
            }
            if (lc != rc) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

