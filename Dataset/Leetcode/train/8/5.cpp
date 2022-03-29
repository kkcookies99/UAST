class Solution {
public:
    int XXX(string s) 
    {
        long long ans = 0;
        int pos = 0;
        int flag = 1;//正负标记
        int signcnt = 0;//符号数量标记
        while(pos<s.size() && s[pos] == ' ')
            pos++;
        while(pos<s.size())
        {
            if(s[pos]>='0' && s[pos]<='9')
            {
                signcnt = 1;
                if(flag==1 && ans*10 + s[pos]-48 > 2147483647)
                    return 2147483647;
                else if(flag==0 && ans*10 + s[pos]-48 > 2147483648)
                    return -2147483648;
                else if(flag==1 && ans*10 + s[pos]-48 <= 2147483647) 
                    ans = ans*10 + s[pos]-48;
                else if(flag==0 && ans*10 + s[pos]-48 <= 2147483648)
                    ans = ans*10 + s[pos]-48;
            }
            else if(s[pos]=='+' && signcnt == 0)
            {
                flag = 1;
                signcnt = 1;
            }
            else if(s[pos] == '-' && signcnt == 0)
            {
                flag = 0;
                signcnt = 1;
            }
            else
                break;
            pos++;
        }
        if(flag == 1)
            return ans;
        else
            return -ans;
    }
};

