 class Solution {
    public boolean XXX(String s) {
        s = s.toLowerCase();    
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !match(chars[left])) left++;
            while (left < right && !match(chars[right])) right--;
            if (left < right && chars[left] != chars[right]) return false;
            left++;
            right--;
        }
        return true;
    }

    private boolean match(char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
    }
}

