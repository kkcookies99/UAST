 class Solution {
public:
    int XXX(string str) {
        int result = 0;
        if (str.length()!=0)    {
            int index = 0;
            while (index<str.length())  {
                if (str[index]==' ')    index ++;
                else    break;
            }
            if (index<=str.length()-1)   {
                if (str[index]=='-')    {
                    index++;
                    while (index<str.length())  {
                        if (str[index]>='0' && str[index]<='9') {
                            if (result<INT_MIN/10 || (result==INT_MIN/10 && (str[index]-'0')>8))    {
                                result = INT_MIN;
                                return result;
                            }
                            else    result = result*10-(str[index]-'0');
                        }
                        else    break;
                        index ++;
                    }
                }
                else if ((str[index]>='0' && str[index]<='9') || str[index]=='+')    {
                    if (str[index]=='+')    index++;
                    while (index<str.length())  {
                        if (str[index]>='0' && str[index]<='9') {
                            if (result>INT_MAX/10 || (result==INT_MAX/10 && (str[index]-'0')>7))    {
                                result = INT_MAX;
                                return result;
                            }
                            else    result = result*10+(str[index]-'0');
                        }
                        else    break;
                        index ++;
                    }
                }                        
            }
        }
        return result;
    }
};

