 class Solution {
    public boolean XXX(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left <= right) {
            if (!isLetterOrNumber(chars[left])) {
                left++;
                continue;
            }
            if (!isLetterOrNumber(chars[right])) {
                right--;
                continue;
            }
            int diff = 'a' - 'A';
            int leftAscii = chars[left];
            if (leftAscii >= 'a') {
                leftAscii = leftAscii - diff;
            }
            int rightAscii = chars[right];
            if (rightAscii >= 'a') {
                rightAscii = rightAscii - diff;
            }
            if (leftAscii != rightAscii) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    private boolean isLetterOrNumber(char c) {
        if ((c <= '9' && c >= '0') || ((c >= 'a' && c <= 'z')) || (c >= 'A' && c <= 'Z')) {
            return true;
        }
        return false;
    }
}

