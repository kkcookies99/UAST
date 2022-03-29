 class Solution {
    public boolean XXX(String s) {
        s = s.replaceAll("[^\\w]|_", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(right) != s.charAt(left)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}

