class Solution {
    // 此题的关键是知晓一个事实：通过不停地取余和除10将原整数从低位到高位
    // 一位一位的取出来，然后迭代加余和乘以10得到翻转的数字。
    // 比如1024，可以通过((((0 + 4) * 10) * 10 + 2) * 10 + 0) + 1
    // 注意最高位x/10==0对应翻转之后的个位，所以不用乘10了，直接加上就可以了
    // 不知道这个，打破脑袋也想不出来，说白了就是套路
    public int XXX(int x) {
        int XXX = 0;
        while (x / 10 != 0) {
            int little = x % 10;
            if (XXX + little > Integer.MAX_VALUE / 10 
                || XXX + little < Integer.MIN_VALUE / 10) {
                return 0;
            }
            XXX = (XXX + little) * 10;
            x /= 10;
        }
        return XXX + x;
    }
}

