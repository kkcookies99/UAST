class Solution {
    public int XXX(int x) {
        boolean isNegative = x < 0;
        if (isNegative) {
            x = -x;
        }
        String s = String.valueOf(x);
        StringBuilder XXXS = new StringBuilder();
        if (isNegative) {
            XXXS.append("-");
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            XXXS.append(s.charAt(i));
        }
        try {
            return Integer.parseInt(XXXS.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

