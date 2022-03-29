 class Solution {
public:
    int XXX(string str) {
        #define IS_DIGITAL(c)  (c >= '0' && c <= '9')
        int i = 0;
        char bFindStart = 0, bNegative = 0;
        int ret = 0;
        //find string_digital
        while(i < str.length())
        {
            if (!bFindStart)
            {
                if (' ' == str[i])
                {
                    i++;
                    continue;
                }
                else if (!IS_DIGITAL(str[i]) && str[i] != '-' && str[i] != '+')
                {
                    return 0;
                }
                else if (str[i] == '-' && i+1 < str.length())
                {
                    if (IS_DIGITAL(str[i+1]))
                    {
                        i++;
                        bFindStart = 1;
                        bNegative = 1;
                        ret = 10*ret - str[i]+'0';
                    }
                    else
                    {
                        return 0;
                    }
                }
                else if (str[i] == '+' && i+1 < str.length())
                {
                    if (IS_DIGITAL(str[i+1]))
                    {
                        i++;
                        bFindStart = 1;
                        ret = 10*ret + str[i] - '0';
                    }
                    else
                    {
                        return 0;
                    }
                } 
                else if (IS_DIGITAL(str[i]))
                {
                    bFindStart = 1;
                    ret = 10*ret + str[i] - '0';
                }
                else
                {
                    //do nothing
                }
            }
            else
            {
                if (IS_DIGITAL(str[i]))
                {
                    if (bNegative)
                    {
                        if (ret < INT_MIN/10 || (ret == INT_MIN/10 && '0'-str[i] < -8))
                        {
                            return INT_MIN;
                        }
                        else
                        {
                            ret = 10*ret + ('0' - str[i]);
                        }
                    }
                    else
                    {
                        if (ret > INT_MAX/10 || (ret == INT_MAX/10 && str[i]-'0' > 7))
                        {
                            return INT_MAX;
                        }
                        else
                        {
                            ret = 10*ret + (str[i] - '0');
                        }
                    }
                }
                else
                {
                    break;
                }
            }
            i++;
        }
        if (!bFindStart)
            return 0;
        else
            return ret;
    } 
};

