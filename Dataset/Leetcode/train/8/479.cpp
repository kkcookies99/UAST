 class Solution {
public:
    int XXX(string s) {
        long r = 0;
        int i = 0;
        bool f = false;
        
        // 去前导空格
        while (i < s.size() && s[i] == ' ' ) i++;

        // 判断正负
        if (s[i] == '-') {
            f = true;
            i++;
        } else if (s[i] == '+') i++;
        
        // 开始转换 (前导零不影响结果)
        while (i < s.size() && s[i] >= '0' && s[i] <= '9') {
            r = r * 10 + (s[i++] - '0');
            // 判定是否越界
            if (!f && r > INT_MAX) return INT_MAX;
            else if (f && -r < INT_MIN) return INT_MIN;
        }

        // 大小转换 以及 判定是否越界
        if (f) r = -r;
        if (r > INT_MAX) r = INT_MAX;
        if (r < INT_MIN) r = INT_MIN;

        return (int)r;
    }
};

