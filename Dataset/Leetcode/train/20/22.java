 class Solution {
    public boolean XXX(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        int t = s.length() / 2;
        while (t > 0) {
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
            t--;
        }

        return s.isEmpty();
    }
}

