 class Solution {
public:
    int XXX(string s) {
        long ans = 0;
        bool flage = false;//不是负数
        int n = s.size();
        if(n==0)
            return 0;
        int index = 0;
        //去前导空格
        while(index<n && s[index]==' '){
            index++;
        }
        //确定符号，+/-号移动索引
        if(s[index]=='-'){
            flage = true;
            index++;
        }
        else if(s[index]=='+')
            index++;
        //计算数字大小
        while(index<n && isdigit(s[index])){
            if(ans >= INT_MAX+(long)1)
                break;            
            ans = ans *10 + s[index]-'0';

            index++;
        }
        //判断结果正负
        ans = flage ? -ans : ans;
        //判断结果大小是否在int范围内
        if(ans < INT_MIN)
            ans = INT_MIN;
        if(ans > INT_MAX)
            ans = INT_MAX;

        return ans;          
    }
};

