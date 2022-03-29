 public String XXX(String a, String b) {
        int length = a.length() > b.length() ? a.length() : b.length();

        char[] chars = new char[length];

        boolean add = false;
        for (int i = 1; i <= length; i++) {
            char c1 = a.length() - i >= 0 ? a.charAt(a.length() - i) : '0';
            char c2 = b.length() - i >= 0 ? b.charAt(b.length() - i) : '0';

            if (c1 == c2) {
                chars[length - i] = add ? '1' : '0';

                add = (c1 == '1');
            } else {
                chars[length - i] = add ? '0' : '1';
            }

        }

        return add ? "1" + String.valueOf(chars) : String.valueOf(chars);
    }

