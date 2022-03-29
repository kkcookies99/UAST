 class Solution {
public:
    int XXX(string s) {
        long res = 0;
        int index=0;
        int sign=1;
        // 处理前导
        while(index < s.size()) {
            if(s[index] == ' ') {
                 index++;
                 continue;
            }
            if(s[index]=='-') {
                sign = -1;
                index++;
                break;
            }
            if(s[index]=='+') {
                sign = 1;
                index++;
                break;
            }
            break;
        }
        // 数字
        while(index < s.size()) {
            // 非数字
            if(s[index]<'0' || s[index]>'9') {
                 break;
            }
            res = res*10 + (s.at(index) - '0');
            res=std::min((long)UINT32_MAX, res); // 保证不溢出
            index++;
        }
        res*=sign;
        res=std::min((long)INT32_MAX, res); // 截取最大值
        res=std::max((long)INT32_MIN, res); // 截取最小值
        return (int)res;
    }
};

