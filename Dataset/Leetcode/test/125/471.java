     public boolean XXX(String s) {
        int j = s.length() - 1;
        int a1 = 0;
        int b1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > j) {
                break;
            }
            a1 = fun1(s.charAt(i));
            if (a1 > 0) {
               while (j > i) {
                    b1 = fun1(s.charAt(j));
                    j--;
                    if (b1 > 0) {
                        if (b1 != a1) {
                            return false;
                        }
                        break;
                    }
                }
            }
        }
        return true;
    }

    private int fun1(char c) {
        if ('A' <= c && c <= 'Z') {
            return c;
        }
        if ('a' <= c && c <= 'z') {
            return c - 32;
        }
        if ('0' <= c && c <= '9') {
            return c;
        }
        return 0;
    }

