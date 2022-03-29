class Solution {
    public String XXX(int n) {
        if (n == 1) {
            return "1";
        }

        String s = XXX(n - 1);  //上一个描述字符串
        int count = 0;  //计数
        char prev = s.charAt(0);
        StringBuilder str = new StringBuilder();
        char c = ' ';
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == prev) {
                count++;    //是连续的数，值加一
            } else {
                //不连续，先把前面连续的部分描述添加进容器中
                str.append(count).append(prev);
                prev = c;
                count = 1;  //计数器初始化为1（当前字符已被计算）
            }
        }
        str.append(count).append(c);    //把最后一部分描述添加进容器

        return str.toString();
    }
}

