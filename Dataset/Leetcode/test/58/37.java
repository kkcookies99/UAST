  public int XXX(String s) {
        int k = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && k == 0);
            else if (s.charAt(i) == ' ' && k != 0) return k;
            else k++;
        }
        return k;
    }

