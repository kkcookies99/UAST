 class Solution {
    public String XXX(String[] strs) {
        int matchLength = Integer.MAX_VALUE;
        for (String s : strs) {
            if (matchLength > s.length()) {
                matchLength = s.length();
            }
        }
        String match = strs[0];
        for (int i = 1; i < strs.length && matchLength > 0; i++) {
            String s = strs[i];
            int matchCount = 0;
            for (int j = 0; matchCount < matchLength; j++) {
                char c = s.charAt(j);
                if (c == match.charAt(matchCount)) {
                    matchCount++;
                } else {
                    break;
                }
            }
            matchLength = matchCount;
        }
        return match.substring(0, matchLength);
    }
}

