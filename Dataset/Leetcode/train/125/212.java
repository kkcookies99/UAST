 class Solution {
    public boolean XXX(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (s.charAt(left) == s.charAt(right) || Character.toUpperCase(s.charAt(left)) == Character.toUpperCase(s.charAt(right))) {
                    left++;
                    right--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

