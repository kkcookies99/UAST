 class Solution {
    public int XXX(String s) {
        if (s.equals("")) return 0;
        char[] chars = s.toCharArray();
        int count = 0;
        int maxSubstringLength = 1;
        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            int j = count;
            while (j < i) {
                if (chars[j] == c) {
                    break;
                }
                j++;
            }
            if (i != j) count = j+1;
            maxSubstringLength = Math.max(maxSubstringLength, i - count + 1);
        }
        return maxSubstringLength;
    }
}

