 public int XXX(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (length > 0 && c == ' ') {
                break;
            }
            if (c != ' ') {
                length++;
            }
        }
        return length;
    }

