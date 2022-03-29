 class Solution {
    public int XXX(String s) {
        int[] cnt = new int[129];
        int res = 0;
        for (int i = 0, j = 0; j < s.length(); j++) {
            cnt[s.charAt(j)]++;
            while (cnt[s.charAt(j)] > 1) {
                cnt[s.charAt(i++)]--;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}

