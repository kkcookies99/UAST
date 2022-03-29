public boolean XXX(int x) {
        String xStr = String.valueOf(x);
        int mid = xStr.length() / 2;
        for (int i = 0, j = xStr.length() - 1; i <= mid && j > i; i++, j--) {
            if (xStr.charAt(i) != xStr.charAt(j)) {
                return false;
            }
        }
        return true;
    }