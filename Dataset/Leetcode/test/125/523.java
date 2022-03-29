  public boolean XXX(String s) {
        if (s.length() == 0 || s.length() == 1) return true;
        char[] chs = s.toCharArray();
        return XXX(chs, 0, chs.length - 1);
    }

    private boolean XXX(char[] chs, int l, int r) {
        if (l >= r) {
            return true;
        }
        while (l < chs.length && l < r && !Character.isDigit(chs[l]) && !Character.isAlphabetic(chs[l])) {
            l++;
        }
        while (r >= 0 && l < r && !Character.isDigit(chs[r]) && !Character.isAlphabetic(chs[r])) {
            r--;
        }
        char c1 = Character.toLowerCase(chs[l]);
        char c2 = Character.toLowerCase(chs[r]);
        return c1 == c2 && XXX(chs, l + 1, r - 1);
    }

