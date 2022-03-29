 class Solution {
    public int XXX(String s) {
        int[] hash = new int[128];
        var arr = s.toCharArray();
        Arrays.fill(hash, -1);
        int n = arr.length;
        int ans = 0;

        for (int i = 0, j = 0; i < n; i++) {
            if (hash[arr[i]] != -1) {
                while (j <= hash[arr[i]]) {
                    hash[arr[j]] = -1;
                    j++;
                }
            } else {
                ans = ans > i - j + 1 ? ans : i - j + 1;
            }
            hash[arr[i]] = i;
        }

        return ans;
    }
}