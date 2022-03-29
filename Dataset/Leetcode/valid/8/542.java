     public int XXX(String s) {
        long num = 0;
        Boolean fh = null;
        for (char c : s.toCharArray()) {
            if (c == '-') {
                if (fh != null) break;
                fh = Boolean.FALSE;
            } else if (c == '+') {
                if (fh != null) break;
                fh = Boolean.TRUE;
            } else if (c >= '0' && c <= '9') {
                fh = fh == null ? Boolean.TRUE : fh;
                num = 10*num + c-'0';
            } else if ((c != ' ' && fh == null) || fh != null) {
                break;
            }
            if ((int) num != num) {
                return fh ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        return fh == null ? (int)num : fh ? (int)num : 0 - (int)num;
    }

