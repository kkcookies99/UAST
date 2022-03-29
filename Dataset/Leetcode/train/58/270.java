 public int XXX(String s) {
        int len = s.length(), i = len - 1;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        len = i;
        while (i >= 0 && s.charAt(i) != ' ') i--;
        return len - i;
    }

