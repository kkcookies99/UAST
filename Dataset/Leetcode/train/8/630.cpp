 class Solution {
public:
    int XXX(string s) {
        long ans=0;
        int flag=0;
        int flag1=0;
        for(int i=0;i<s.length();i++)
        {
            if((s[i]<='9')&&(s[i]>='0')) 
            {
                ans=ans*10+s[i]-'0';
                flag1=1;//如果已经开始读入数字，则flag1=1,后面再读入别的字符直接退出
            }
            else
            {
                if(flag1==0) //在读入数字字符之前读入非数字字符
                {
                    if(s[i]==' ') continue;//空格可以连续多个读入
                    else if(s[i]=='-') flag=1; //读入负号，flag=1输出时将结果取负号
                    else if(s[i]=='+');//读入＋号，什么也不做
                    else break;//读入别的字符则退出
                    flag1=1;     //在读入数字字符之前读入非数字字符之后，flag1=1,下次再读入非数字字符直接退出
                }
                else break;
            }
            if((flag!=1) &&(ans>2147483647)) return 2147483647;
            if((flag==1) &&(ans>2147483648)) return -2147483648;
        }
        if(flag==1) ans=-ans;
        return ans;
    }
};

