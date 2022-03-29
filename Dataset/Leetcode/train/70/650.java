public int XXX(int n) {
        ++n;
        int pre = 1, cur = 1;
        for (int i = 3; i <= n; i++) {
            int sum = pre + cur;
            pre = cur;
            cur = sum;
        }
        return cur;
}

