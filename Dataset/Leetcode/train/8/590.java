 class Solution {
    public int XXX(String s) {
        if (s.length() == 0) {
            return 0;
        }
        // 是否开始统计
        boolean flag = false;
        // 是否为负数
        boolean fu = false;
        // 开始索引
        int start = -1;
        // 结束索引
        int end = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 开头为空白的跳过
            if (c == ' ' && !flag) {
                continue;
            }
            if ((c >= '0' && c <= '9') || c == '+') {
                if (!flag) {
                    // 没有统计 并且为正好 更新统计标示 和开始索引
                    if (c == '+') {
                        flag = true;
                        start = i;
                        continue;
                    }
                    // 不为正号 直接更新索引
                    start = i;
                }
                // 如果统计过了
                if (c == '+') {
                    // 开始结尾索引不为0 直接终止循环
                    if(end != -1 && start != -1){
                        break;
                    }
                    // 否则说明两个符号相连，直接返回0
                    return 0;
                }
                // 同步结尾坐标
                end = Math.max(end, i);
                flag = true;
            } else {
                // 已经开始计数了，但当前为负号的，直接停止循环
                if (flag) {
                    break;
                }
                // 没有开始统计 负数标示置为true 开始坐标更新 统计坐标更新
                if (c == '-' && !flag) {
                    fu = true;
                    flag = true;
                    start = i;
                } else {
                    // 其他字符直接返回0
                    return 0;
                }
            }
        }
        // 异常处理
        int num;
        try {
            num = start == -1 || end == -1 ? 0 : Integer.parseInt(s.substring(start, end + 1));
        } catch (Exception e) {
            num = fu ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return num;
    }
}

