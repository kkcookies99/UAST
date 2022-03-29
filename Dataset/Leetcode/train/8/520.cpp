 class Solution {
public:
    int XXX(string s)
    {
        if(s.empty()) return 0;
        if(s[0] == ' ')//去除前导空格
        {
            deleteFrontChar(s,' ');
        }
        minus = false;
        if(s[0] == '-' || s[0] == '+' )//确定正负号
        {
            minus = s[0] == '-'?true:false;
            if(s.size() == 1)  return 0;
            s = s.substr(1,s.size() - 1);
        }
        if(s[0] == '0')//去除前导 0
        {
           deleteFrontChar(s,'0');
           if(s.size() == 0) return 0;
        }
        return XXXCore(s);
    }

    int XXXCore(const string &s)
    {
        long long ans = 0;
        for(int i = 0; i < s.size(); ++i)
        {
            if(s[i] >= '0' && s[i] <= '9')
            {
                ans = ans * 10 + (s[i] - '0');
                //判断是否溢出
                long long tmp = minus?-ans:ans;
                if(tmp >= INT_MAX) return INT_MAX;
                if(tmp <= INT_MIN) return INT_MIN;
            }
            else //已到达非数字字符
            {
                break;
            }
        }
        ans = minus?-ans:ans;//加上正负号
        return ans;
    }
    
//去除 字符串 s 的 前导字符 c
    void deleteFrontChar(string &s,char c)
    {
        int i = 0;
        while(i < s.size() && s[i] == c)
        {
            i++;
        }
        if(i == s.size())
        {
            s = "";
            return;
        }
        s = s.substr(i,s.size() - i);
        return;
    }

private:
    bool minus ;
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


