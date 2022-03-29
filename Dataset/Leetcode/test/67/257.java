     public String XXX(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char ch1 = getChar(a, 0);
        char ch2 = getChar(b, 0);
        char ch3 = '0';

        for (int i = 1; i <= Math.max(a.length(), b.length()); i++) {
            char[] sum = sum(ch1, ch2, ch3);
            sb.append(sum[0]);

            ch1 = getChar(a, i);
            ch2 = getChar(b, i);
            ch3 = sum[1];
        }
        if (ch3 != '0') {
            sb.append(ch3);
        }

        return sb.reverse().toString();
    }

    char getChar(String str, int i) {
        if (i >= str.length()) {
            return '0';
        } else {
            return str.charAt(str.length() - i - 1);
        }
    }

    private char[] sum(char ch1, char ch2, char ch3) {
        int sum = ch1 + ch2 + ch3 - 3 * '0';
        if (sum == 0) {
            return new char[] {'0', '0'};
        } else if (sum == 1) {
            return new char[] {'1', '0'};
        } else if (sum == 2) {
            return new char[] {'0', '1'};
        } else {
            return new char[] {'1', '1'};
        }
    }

