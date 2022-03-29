 class Solution {
public:
    int XXX(string s) {
        int idx = 0, op = 1;
        int size = s.size(), res = 0;

        // 消除空格
        while (s[idx] == ' ') ++idx;
        
        // 确定符号
        if (s[idx] == '-') {
            op = -1;
            ++idx;
        } else if (s[idx] == '+') ++idx;

        // 读数
        while (idx < size) {
            // 遇到非数字字符
            if (s[idx] < '0' || s[idx] > '9') break;
            int cur = s[idx] - '0';

            if (op == 1) {
                // 判断正数溢出
                if (INT_MAX / 10 < res || INT_MAX - cur < res * 10) return INT_MAX;
                else res = res * 10 + cur;
            } else {
                // 判断负数溢出
                if (INT_MIN / 10 > res || INT_MIN + cur > res * 10) return INT_MIN;
                else res = res * 10 - cur;
            }
            ++idx;
        }
        return res;
    }
};

