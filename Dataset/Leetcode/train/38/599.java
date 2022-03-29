 class Solution {
    public String XXX(int n) {
        return count(n, "1");
    }

    public String count(int n, String numStrs) {
        if (n == 1) {
            return numStrs;
        }
        String tempStr = count(--n, numStrs);
        StringBuilder sb = new StringBuilder();
        int numTotal = 1;
        for (int i = 0; i < tempStr.length(); i++) {
            if (i > 0) {
                if (tempStr.charAt(i - 1) == tempStr.charAt(i)) {
                    numTotal += 1;
                } else {
                    sb.append(numTotal).append(tempStr.charAt(i - 1));
                    numTotal = 1;
                }
            }
        }
        sb.append(numTotal).append(tempStr.charAt(tempStr.length() - 1));
        return sb.toString();
    }
}

