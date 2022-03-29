 class Solution {
    public boolean XXX(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(chars[left])) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(chars[right])) {
                right--;
            }
            if (left < right) {
                if (Character.toLowerCase(chars[left++]) != Character.toLowerCase(chars[right--])) {
                    return false;
                }
            }
        }
        return true;
    }
}

