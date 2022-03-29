 class Solution {
    public int XXX(String s) {
        int len = s.length();
        // 正负数的标识，默认是正数
        int flag = 1;
        // 处理前导空格和符号
        for (int i = 0; i < len; i++) {
            String temp = s.substring(0, 1);
            if (" ".equals(temp)) {
                s = s.substring(1);
            } else {
                // 不是空格就跳出循环，顺便看一下这个是否为符号
                if ("+".equals(temp)) {
                    s = s.substring(1);
                } else if ("-".equals(temp)) {
                    // 负数标识
                    flag = -1;
                    s = s.substring(1);
                }
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        len = s.length();
        List<String> nums = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
        while (len > 0) {
            // 每次都截取第一位字符
            String start = s.substring(0, 1);
            // 然后让第一个字符从字符串中移除
            s = s.substring(1);
            // 长度-1
            len--;
            // 判断是否为数字，是数字就添加进结果集，不是数字就跳出循环
            if (nums.contains(start)) {
                sb.append(start);
            } else {
                break;
            }
        }
        
        // 如果结果集是空的，可以直接返回0
        if (sb.length() == 0) {
            return 0;
        }
    
        // 此处利用异常捕捉和正负数标识处理数字超过int返回的情况
        int res = 0;
        try {
            res = Integer.parseInt(sb.toString()) * flag;
        } catch (NumberFormatException e) {
            if (flag > 0) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.MIN_VALUE;
            }
        }
        return res;
    }
}

