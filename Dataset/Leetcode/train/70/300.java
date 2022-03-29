class Solution {
    public int XXX(int n) {
        int[] cache = new int[n + 1];
        return XXX(n, cache);
    }

    private int XXX(int n, int[] cache) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        // 计算结果已被缓存
        if (cache[n] != 0)
            return cache[n];
        // 第一次计算,将结果放入缓存            
        cache[n] = XXX(n - 1, cache) + XXX(n - 2, cache);
        return cache[n];
    }
}

