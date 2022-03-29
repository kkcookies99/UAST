class Solution {
    public int XXX(int x) {

        if (x == 0) return 0; // 如果不加这个判断, 则x为0时会返回65536

        int num = 0, mul;

        // 逐比特构造结果的值:
        // 遍历第16, 15, 14, ..., 1位, 判断每一位应该置1还是置0, 偏大则置0, 偏小则置1
        //     17位以上一定是全0, 否则会溢出
        for (int bit = 1 << 15; bit > 0; bit >>= 1) {
           
            // 尝试将第n位置1
            num ^= bit;

            mul = num * num;
            if (mul <= 0 || mul > x) { // 超出范围, 将第n位清0
                num ^= bit;
            }

        }
        return num;
    }
}

