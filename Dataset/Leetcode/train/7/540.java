 class Solution {
    public int XXX(int x) {
        try {
            if (x == 0) {
                return 0;
            }
            if (x > 0) {
                String str = x + "";
                String rstr = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    rstr += str.charAt(i) + "";
                }
                int x1 = Integer.parseInt(rstr);
                return x1;
            } else if (x == 0) {
                return 0;
            } else {
                x = Math.abs(x);
                String str = x + "";
                String rstr = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    rstr += str.charAt(i) + "";
                }
                int x1 = Integer.parseInt(rstr);
                return -x1;
            }
        } catch (Exception e) {
            return 0;
        }
    }
}

