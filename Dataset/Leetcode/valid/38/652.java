 class Solution {
    public String XXX(int n) {
        if (n == 1) {
            return "1";
        }
        String previous = XXX(n - 1);
        char c = previous.charAt(0);
        int num = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < previous.length(); i++) {
            if (c == previous.charAt(i)) {
                num++;
            } else {
                sb.append(num).append(c);
                c = previous.charAt(i);
                num = 1;
            }
        }
        sb.append(num).append(c);
        return sb.toString();
    }
}

