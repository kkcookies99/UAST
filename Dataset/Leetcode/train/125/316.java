 class Solution {
    public boolean XXX(String s) {
        if (s == null){
            return true;
        }
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for(char ch : chars) {
            if (ch >= 'A' && ch <= 'Z') {
                builder.append((char)(ch + 32));
            }
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                builder.append(ch);
            }
        }
        int right = builder.length() - 1;
        int left = 0;
        while(left < right) {
            if (builder.charAt(left) != builder.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

