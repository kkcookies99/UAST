 class Solution {
    public String XXX(String s) {
        // 当前最大回文长度
        int max = 0;
        // 回文开始位置
        int start = 0;
        // 回文中心重复部分长度
        int sameLength = 1;
        // 遍历，跳过重复部分
        for(int i = 0; i < s.length(); i+=sameLength) {
            // 初始化重复长度，重复部分至少有一个字符
            // 向后查找重复部分，计算重复长度
            for(sameLength = 1; i + sameLength < s.length() && s.charAt(i) == s.charAt(i + sameLength); sameLength++);
            // 初始化回文长度
            int length = sameLength;
            // 中心扩散，计算回文长度
            for(int j = 1; i + j + sameLength - 1 < s.length() && i - j >= 0 && s.charAt(i + j + sameLength - 1) == s.charAt(i-j); j++, length += 2);
            // 与现有值比较大小
            if(length > max) {
                max = length;
                // 计算开始位置
                start = i - (length - sameLength) / 2;
            }
        }
        return s.substring(start, start+max);
    }
}

