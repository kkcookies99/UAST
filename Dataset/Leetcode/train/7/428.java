 public int XXX(int x) {
        String s;
        if (x < 0) {
            s = "-" + new StringBuffer(String.valueOf(x*-1)).XXX().toString();
        } else {
            s = new StringBuffer(String.valueOf(x)).XXX().toString();
        }
        int k;
        try {
            k = Integer.parseInt(s);
        } catch (Exception e) {
            return 0;
        }
        return k;
    }

