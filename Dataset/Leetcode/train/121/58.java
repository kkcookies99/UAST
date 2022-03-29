     public int XXX(int[] prices) {
        int min = Integer.MAX_VALUE; // 记录之前的最小值
        int ret = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            ret = Math.max(ret, price - min); // 计算最大收益
        }
        return ret;
    }

