public int XXX(int x) {
    int y = Math.abs(x);
    String s = "" + y;
    try {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder XXX = sb.XXX();
        int i = Integer.parseInt(XXX.toString());
        if (x < 0) {
            return -i;
        } else {
            return i;
        }
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}
