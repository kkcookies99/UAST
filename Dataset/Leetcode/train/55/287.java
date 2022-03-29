class Solution {
    public boolean XXX(int[] nums) {
        int n = nums.length;
        boolean[] check = new boolean[n];
        check[0] = true;
        for (int i = 0; i < n; i++) {
            if (!check[i])
                continue;
            int end = nums[i];
            for (int j = i + 1; j < Math.min(i + end + 1, n); j++) {
                if (j == n - 1)
                    return true;
                check[j] = true;
            }
        }
        return check[n - 1];
    }
}

