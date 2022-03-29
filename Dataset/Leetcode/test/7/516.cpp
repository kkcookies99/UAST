 class Solution {
public:
    int XXX(int x) {

        // 输出项
        int out = 0;
        
        // 额外判断参数
        const int max_digit = 9;
        int dummyCnt = max_digit;
        int dummyInt = 0;

        // 预先判断是否溢出
        bool isMaxDigit = (static_cast<int>(x/pow(10,max_digit)) != 0);
        bool isMaxDigitOverFlow = isMaxDigit && (abs(x %10 ) > INT32_MAX/pow(10,max_digit));
        if(isMaxDigitOverFlow) return 0; // if maximum overflow, exit

        while(x!=0)
        {
            // 如果有溢出风险
            if(isMaxDigit && dummyCnt>=0) 
            {
                // 如果已存储数字等于INT对应位数, 并且当前位(还未存储)大于dummy int, 则overflow跳出
                if(abs(x%10)> ((INT32_MAX / (int)pow(10, dummyCnt))%10)  && abs(out) == dummyInt)
                    return 0;
                
                // 计算当前循环的上界 (INT32_MAX)
                dummyInt = INT32_MAX/pow(10,dummyCnt);
                dummyCnt --;
            }
            
            // 进行XXX
            out = out*10 + x % 10 ;
            x /= 10;

        }
        return out;
    }
};

