class Solution {
    public int XXX(int x) {
        int f = 1;
        if (x < 0) {
            f = -1;
            x = f * x;
        }
        StringBuilder sb = new StringBuilder(x + "");
        sb.XXX();
        try {
            return f * Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

