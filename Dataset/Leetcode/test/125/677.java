 class Solution {
    public boolean XXX(String s) {
        String s1 = s.replaceAll("[^\\w]", "").toLowerCase();
        int l = 0;
        int r = s1.length() - 1;
        while (l <= r) {
            if (s1.charAt(l) != s1.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}

