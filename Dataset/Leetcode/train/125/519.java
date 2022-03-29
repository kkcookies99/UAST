     public boolean XXX(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        s = s.replaceAll("[^0-9A-Za-z]", "").toLowerCase();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
        return true;
    }

