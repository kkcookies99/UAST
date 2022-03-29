 class Solution {
    public String XXX(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int end = 0;
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            end = s.length() - 1;
            while (end >= i) {
                if (isHuiwenStr(i, end, s)) {
                    String sub = s.substring(i, end + 1);
                    if (temp.length() < sub.length()) {
                        temp = sub;
                    }
                    break;
                }
                end--;
            }
        }
        return temp;
    }

    private boolean isHuiwenStr(int start, int end, String sub) {
        if (start >= end) {
            return true;
        }
        if (sub.charAt(start) == sub.charAt(end)) {
            start++;
            end--;
            return isHuiwenStr(start, end, sub);
        }
        return false;
    }
}

