 class Solution {
    public String XXX(int n) {
        if (n == 1) return "1";
        String s = XXX(n - 1);
        return say(s);
    }

    public String say(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < s.length()) {
            char c = s.charAt(index);
            int len = 1;
            for (int i = index + 1; i < s.length(); i++) {
                if (c == s.charAt(i))
                    len++;
                else
                    break;
            }
            sb.append(len).append(c);
            index = index + len;
        }
        return sb.toString();
    }
}

