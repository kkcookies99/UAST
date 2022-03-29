 public boolean XXX(String s) {
        String s1 = s.toLowerCase();
        if (s1.length() == 0)
            return true;
        int a = 0;
        int count = 0;
        int length = s1.length() - 1;
        while (count + a < s1.length()) {
            char ca = s1.charAt(a);
            if ((ca >= 'a' && ca <= 'z') || (ca >= '0' && ca <= '9')) {
                char cb = s1.charAt(length - count);
                if ((cb >= 'a' && cb <= 'z') || (cb >= '0' && cb <= '9')) {
                    if (ca == cb) {
                        count++;
                        a++;
                    } else return false;
                } else {
                    length--;
                }
            } else {
                a++;
            }
        }
        return true;
    }

