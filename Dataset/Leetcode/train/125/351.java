 class Solution {
    public boolean XXX(String s) {
        char[] c = s.toLowerCase().toCharArray();
        int start = 0, end = c.length - 1;
        while (start < end) {
            if (!(Character.isLetterOrDigit(c[start]))) {
                start++;
                continue;
            }
            if (!(Character.isLetterOrDigit(c[end]))) {
                end--;
                continue;
            }
            if (c[start] != c[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}

