class Solution {
   public:
    bool legal(char num, char mode = 1) {
        // mode 1:前导数 ; mode2:前导标识符之后的首数字; mode3:末尾数字
        if (mode == 1) {
            return ((num <= '9' && num >= '0') || num == '+' || num == '-');
        } else if (mode == 2) {
            return (num <= '9' && num >= '1');
        } else {
            return (num <= '9' && num >= '0');
        }
    }
    int XXX(string s) {
        //丢掉前导空格
        int st = 0, res = 0;
        while (st < s.size() - 1 && s[st] == ' ') st++;
        // cout << "curr st: " << st << endl;
        //检验首字符是否合法
        if (legal(s[st], 1)) {
            if (s[st] == '-') {
                res = -1;
                st++;
            } else if (s[st] == '+') {
                res = 1;
                st++;
            } else {
                res = 1;
            }
            while (!legal(s[st], 2)) {
                if (s[st] == '0')
                    st++;
                else
                    return 0;
            }

            stack<int> q;
            int q_size = 0;
            while (legal(s[st], 3)) {
                // cout << "push:" << s[st] - '0' << " to stack.\n";
                q.push(s[st] - '0');
                st++, q_size++;
                if (q_size > 10) {
                    //大于10位,说明一定越界;剪枝避免后续计算
                    res = (res == -1) ? INT_MIN : INT_MAX;
                    return res;
                }
            }
            //判断当前值是否在整形范围内
            long tmp = 0;
            while (!q.empty()) {
                tmp += (q.top()) * pow(10, (q_size - q.size()));
                q.pop();
            }
            tmp *= res == 1 ? 1 : -1;
            if (tmp <= INT_MAX && tmp >= INT_MIN)
                res = tmp;
            else if (tmp < INT_MIN) {
                res = INT_MIN;
            } else
                res = INT_MAX;
        }
        return res;
    }
};

