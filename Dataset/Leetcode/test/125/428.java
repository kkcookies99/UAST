 class Solution {
    public boolean XXX(String s) {
        StringBuilder builder = new StringBuilder();
        char[] chs = s.toCharArray();
        for(char ch : chs) {
            if (ch>= 'A' && ch <= 'Z') {
                builder.append((char)(ch + 32));
            }
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                builder.append(ch);
            }
        }
        int left = 0;
        int right = builder.length() - 1;
        while (left < right) {
            if (builder.charAt(left) != builder.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

