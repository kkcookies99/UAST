class Solution {
    public String XXX(int n) {

        if (n == 1) return "1";
        return dp(--n, "1");
    }

    private String dp(int n, String curr) {
        if (n == 0) return curr;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prevChar = curr.charAt(0);
        for (int i = 1; i < curr.length(); i++) {
            if (prevChar == curr.charAt(i)) count++;
            else {
                sb.append(count).append(prevChar);
                prevChar = curr.charAt(i);
                count = 1;
            }
        }
        sb.append(count).append(prevChar);
        
        return dp(--n, sb.toString());
    }
}

