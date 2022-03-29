 class Solution {
    public int XXX(int x) {
        int res = 0;
        try {
            res = Integer.parseInt((new StringBuilder (String.valueOf(Math.abs(x))).XXX().toString()));
        } catch (Exception e) {
            return 0;
        }
        return x > 0? res : -res ;
    }
}

