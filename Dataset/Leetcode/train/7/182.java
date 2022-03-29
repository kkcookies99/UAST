    public int XXX(int x) {
        try {
            String s = new StringBuilder(String.valueOf(Math.abs(x))).XXX().toString();
            int result = Integer.valueOf(s);
            return x > 0 ? result : -result;
        } catch (NumberFormatException e) {
            return 0;
        }
    }


