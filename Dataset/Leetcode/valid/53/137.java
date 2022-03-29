class Solution {
    public int XXX(int[] nums) {
        int res = -100000, max = -100000;
        for (int item : nums) {
            max = Math.max(max , item);
            max = Math.max(max , res);
            res = res + item > 0 ? res + item : -100000;
            if (res == -100000 && item > 0)
                res = item;
        }
        return Math.max(max,res);
    }
}

