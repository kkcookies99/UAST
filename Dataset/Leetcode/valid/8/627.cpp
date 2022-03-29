 class Solution {
public:
    int XXX(string s) {
        int i = 0;
        while (s[i] == ' ')  {
            ++i; // 忽略前导空格
        }

        // 处理符号
        int positive = 1;
        if (s[i] == '-') {
            positive = -1;
            ++i;
        } else if (s[i] == '+') {
            ++i;
        }

        long ret = 0;
        for (; i < s.size(); ++i) {
            int num = s[i] - '0';
            if (num >=0 && num <= 9) {
                ret = ret * 10 + num;
    
                // 注意这里至少要保证不超出long范围，判断是否溢出了int范围来保证不超出long
                if (positive == -1) {
                    // 32bit int范围是-2147483648~2147483647，假设ret为2147483648且符号是负的，这里要返回-2147483648==-(INT_MAX+1)
                    if (ret > (long)INT_MAX + 1) // 注意这里的INT_MAX要强转成long再加1,不然默认单位为int的话其+1会溢出
                        return INT_MIN;
                } else {
                    if (ret > INT_MAX) {
                        return INT_MAX;
                    }
                }
            } else {
                // 遇到非'0'-'9'的字符结束
                break;
            }
        }

        if (positive == -1) // 这里还要做符号判断
            return -ret;
        else
            return ret;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


