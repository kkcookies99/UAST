 class Solution {
    public String XXX(String s, int numRows) {
        // 注意：成功完成z字形排列，至少要求：s.length() >= numRows（假设题目默认如此）
        // 如果是1行，直接输出原字符串即可
        if (numRows == 1) return s;
        // 将字符串转化为char数组
        char[] ch = s.toCharArray();
        // 创建字符串缓冲区
        // StringBuilder默认按照："2*原容量+2"的方式扩容
        // 题设字符串长度可能为1000，设置扩容次数最多1次，故缓冲区初始容量取500
        // 如果完全不允许扩容，缓冲区长度太大，耗费资源
        // 如果扩容次数太多，又影响程序执行效率
        StringBuilder strBuilder = new StringBuilder(500);
        for (int i = 0; i < numRows; i++) {
            // case1
            if (i == 0 || i == numRows - 1) {
                for (int j = i; j < s.length(); j += 2 * (numRows - 1)) {
                    strBuilder.append(ch[j]);
                }
                continue;
            }
            // case2
            for (int j = i, flag = 1; j < s.length(); j += (flag++ % 2 == 1) ? (numRows - i - 1) * 2 : i << 1) {
                strBuilder.append(ch[j]);
            }
        }
        return strBuilder.toString();
    }
}

