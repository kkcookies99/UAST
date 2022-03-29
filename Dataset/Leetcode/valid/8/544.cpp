 class Solution {
public:
    int XXX(string str)
    {
        long long ans = 0;//防止溢出
        if(str.empty()) return 0;//空串返回 0
        //去除前导空格
        int i = 0;
        while(i < str.size() && str[i] == ' ') ++i;
        if( i == str.size()) return 0;
        str = str.substr(i);
        
        bool minus = str[0] == '-';//字符串数的正负
        if(str[0] == '-' || str[0] == '+')//去掉前面的正负号
        {
            str = str.substr(1);
        }
        i = 0;
        for(; i < str.size(); ++i)
        {
            if(str[i] >= '0' && str[i] <= '9')
            {
                ans = ans*10 + (str[i] - '0');
                if(!minus && ans > INT_MAX) return INT_MAX;
                if(minus && -ans < INT_MIN) return INT_MIN;
            }
            else
            {
                break;
            }
        }
        return minus?-ans:ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


