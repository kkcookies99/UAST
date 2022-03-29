 class Solution {
    public String XXX(String s) {
        if (s.length() <= 1)
            return s;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = longest(s, i,i);
            String s2 = longest(s, i, i+1);
            s1 = s1.length() > s2.length() ? s1 : s2;
            res = res.length() > s1.length() ? res : s1;
        }
        return res;
    }

    String longest(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return s.substring(start+1, end);
    }
}

