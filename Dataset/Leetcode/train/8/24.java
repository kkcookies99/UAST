    public int XXX(String s) {
        int k = 0;
        long ans = 0;
        boolean f = false;
        char[] chars = s.toCharArray();
         for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                if (k == 0 && (chars[i] == '-' || chars[i] == '+')) {
                    if (chars[i] == '-') {
                        f = true;
                    }
                    k++;
                } else {
                    if (chars[i] >= '0' && chars[i] <= '9') {
                        ans = ans * 10 + (int) (chars[i] - 48);
                        k++;
                        if (ans > Integer.MAX_VALUE) {
                            if (f) {
                                if (-ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                            } else {
                                return Integer.MAX_VALUE;
                            }
                        }

                    } else {
                        break;
                    }
                }
            } else {
                if (k > 0) break;
            }
        }
        
        if (f) ans = -ans;

        return (int) ans;
    }

