 class Solution {
    public boolean XXX(int x) {
        // 判断边界值
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;

        // 转成字符串
        String xString = ((Integer) x).toString();
        
        // 从字符串两边依次取出数据, 进行比较, 如果不相等, 就不是回文数, 返回false
        for (int i = 0; i < xString.length() / 2; i++) {
            if (xString.charAt(i) != xString.charAt(xString.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}

