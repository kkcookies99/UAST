int XXX(int x){
    // 二分法
    int l = 0;
    int r = x;
    int k;

    while (l <= r) {
        int m = l + (r - l) / 2;
        long long v = (long long)m * m;
        if (v == x) return m; // 如果恰好等于就是答案
        else if (v < x) { // 否则记录最后一次比 x 小的 m，是最终答案
            k = m;
            l = m + 1;
        } else {
            r = m - 1;
        }
    }
    return k;
}

