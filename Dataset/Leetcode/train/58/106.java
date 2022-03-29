     public int XXX(String s) {
        char[] chs = s.toCharArray();
        int len = 0;
        for (int i = chs.length - 1; i >= 0; i--) {
            if (chs[i] == ' ') {
                if (len > 0) {
                    break;
                }
            } else {
                len++;
            }
        }
        return len;
    }

