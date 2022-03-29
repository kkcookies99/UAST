public boolean XXX(int x) {
        char[] xChars = String.valueOf(x).toCharArray();
        int l = xChars.length;
        for (int i = 0, j = l / 2; i < j; i++) {
            if (xChars[i] != xChars[l - i - 1]) {
                return false;
            }
        }
        return true;
    }

