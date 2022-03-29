 class Solution {
public:
    int XXX(string str) {
        long num=0;
        int flag=1;
        if(str.length()<1)
            return 0;
        int j=0;
        while(str[j]==' ')
            j++;
        if(!(str[j]=='-' || str[j]=='+' || str[j]==' ' || (str[j]<='9' && str[j]>='0')))
            return 0;
        if(str[j]=='-')
        {
            flag=-1;
            j++;
            for(int i=j;i<str.size();i++)
            {
                if(str[i]<='9' && str[i]>='0')
                {
                    num=num*10+(str[i]-'0');
                    if(num>INT_MAX)
                        return INT_MIN;
                }
                else 
                {
                    if(num>INT_MAX)
                        return INT_MIN;
                    else 
                        return (int)num*flag;
                }
            }
        }
        else
        {
            if(str[j]=='+')
                j++;
            for(int i=j;i<str.size();i++)
            {
               if(str[i]<='9' && str[i]>='0')
                {
                    num=num*10+(str[i]-'0');
                   if(num>INT_MAX)
                        return INT_MAX;
                }
                else 
                {
                    if(num>INT_MAX)
                        return INT_MIN;
                    else 
                        return (int)num;
                } 
            }
        }
        return (int)num*flag;
    }
};

