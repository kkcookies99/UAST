class Solution {
public:
    int XXX(string str) {
        uint32_t ret = 0;
        bool flag = false; //数字或符号开始标记
        bool flag2 = false; //数字开始标记
        bool ng = false; //是否负数
        const int8_t count = str.length();
        for (int8_t i = 0; i < count; ++i) {
            char c = str.at(i);
            if (!flag && c != ' ' && c != '-' && c != '+' && (c < '0' || c > '9'))
                return 0;
            
            if (!flag && c == ' ')
                continue;
            
            if (!flag && c == '+')
            {
                flag = true;
                continue;
            }
            
            if (!flag && c == '-')
            {
                flag = true;
                ng = true;
                continue;
            }
            
            if (flag && !flag2 && (c < '0' || c > '9'))
                return 0;
            
            if (flag2 && (c < '0' || c > '9'))
                break;
            
            if (!flag2)
                flag2 = true;
            
            if (!flag)
                flag = true;
            
            if((ng && ret > INT_MAX / 10) || (ng && ret == INT_MAX/10 && c >= '8')) 
                return INT_MIN;
            
            if(ret > INT_MAX / 10 || (ret == INT_MAX/10 && c > '7')) 
                return INT_MAX;
            
            ret = ret*10 + c - '0';
        }
        
        return ng ? -ret : ret;
    }
};

