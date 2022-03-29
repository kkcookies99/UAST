 class Solution {
public:
    int XXX(string str) {
        int i = 0;
        while (str[i] == ' ')
            ++i;
        int flag = 1;
        if (str[i] == '-')
        {
            ++i;
            flag = -1;
        }
        else if (str[i] == '+')
            ++i;
        if (str[i] < '0' || str[i] >'9')
            return 0;
        long long res = 0;
        while (str[i] >= '0' && str[i] <= '9')
        {
            res = 10*res + (str[i] - '0');
            ++i;
            if (res*flag> INT_MAX)
                return INT_MAX;
            else if (res*flag < INT_MIN)
                return INT_MIN;
        }
        return res*flag;
            
    }
};

