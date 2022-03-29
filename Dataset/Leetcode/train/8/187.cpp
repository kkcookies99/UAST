class Solution {
public:
    int XXX(string str) {
        string NumStr="";
        int out = 0;
        int LoopVar = 0;
        int result=0;
        int LastResult;
        int sign = 2;   //0负1正,2表示未获取到符号
        while(str[LoopVar] == ' ')//过滤掉空格
            LoopVar++;
        for(;LoopVar<str.size();LoopVar++)
        {
            if (str[LoopVar] == '-' && sign==2)
            {
                sign = -1;
                continue;
            }
            if (str[LoopVar] == '+' && sign==2)
            {
                sign = 1;
                continue;
            }
            if (str[LoopVar]>='0' && str[LoopVar]<='9')
            {
                if (sign==2)    sign = 1;
                NumStr+=str[LoopVar];
                continue;
            }
            break;
        }
        if (NumStr=="") return 0;
        for (int i=0;i<NumStr.size();i++)
        {
            if (result > 214748364)
                out = 1;
            if (result == 214748364 && NumStr[i]>'7')
                out = 1;
            if (out == 1)   break;
            result = result *10 + (NumStr[i]-'0');
        }
        if (out == 1)
        {
            if (sign==-1)   return -2147483648;
            if (sign==1)    return 2147483647;
        }
        return sign*result;
    }
};

