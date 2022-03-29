 public static String XXX(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String lStr = getAroundCharacter(s, i, i);
            String rStr = getAroundCharacter(s, i, i + 1);
            String temp = lStr.length() >= rStr.length() ? lStr : rStr;
            result = result.length() >= temp.length() ? result : temp;
        }
        return result;
    }

    private static String getAroundCharacter(String s, int l, int r) {
        boolean flag = false;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
            flag = true;
        }
        if (flag) {
            if (l <0 || r > s.length() -1 || s.charAt(l) != s.charAt(r)) {
                l += 1;
            }
        }

        return s.substring(l, r);
    }

