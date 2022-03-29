 class Solution {
    public String XXX(int n) {
        if (n == 1) {
            return "1";
        }

        String previous = XXX(n-1);
        StringBuilder sb = new StringBuilder();

        int left = 0, right = 0;

        while (right < previous.length()) {
            while (right< previous.length() && previous.charAt(right) == previous.charAt(left)) {
                right++;
            }

            int curCount = right - left;
            sb.append(curCount);
            sb.append(previous.charAt(left));
            left = right;
        }

        return sb.toString();
    }
}
