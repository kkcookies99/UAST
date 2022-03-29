     public boolean XXX(int x) {
        if (x < 0)
            return false;
        String str = String.valueOf(x);
        for (int i = 0, j = str.length() - 1; i<=j; i++, j--) {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }

