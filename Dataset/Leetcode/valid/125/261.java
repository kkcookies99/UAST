 class Solution {
    public boolean XXX(String s) {
        char[] cs = s.toCharArray();
        for (int i = 0, j = cs.length - 1; i <= j; ) {
            if (!Character.isLetterOrDigit(cs[i])) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(cs[j])) {
                j--;
                continue;
            }
            if (Character.toLowerCase(cs[i]) != Character.toLowerCase(cs[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
