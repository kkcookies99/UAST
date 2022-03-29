 class Solution {
    public int XXX(String s) {
        boolean prefix = true;
        int rate = 1;
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (prefix) {
                if (s.charAt(i) == 32) continue;
                else if (s.charAt(i) == 43 || s.charAt(i) == 45 || (s.charAt(i) > 47 && s.charAt(i) < 58)) {
                    prefix = false;
                    if (s.charAt(i) == 45) rate = -1;
                    if (s.charAt(i) > 47 && s.charAt(i) < 58) strb.append(s.charAt(i));
                } else return 0;
            } else {
                if (s.charAt(i) > 47 && s.charAt(i) < 58) strb.append(s.charAt(i));
                else break;
            }
        }
        try {
            return strb.length() == 0 ? 0 : Integer.parseInt(strb.toString()) * rate;
        } catch (Exception e) {
            return rate == 1 ? 2147483647 : -2147483648;
        }
    }
}

