 class Solution {
public:
    int XXX(string s) {
        long ans = 0;
        int flag =0;
        string::iterator pos = s.begin();
        while(pos != s.end())
        {
            if(*pos == ' ')pos++;
            else if(*pos == '-')
            {
                flag = 1;
                pos++;
                break;
            }
            else if(*pos == '+' )
            {
                flag = 0;
                pos ++;
                break;
            }
            else break;
        }
        while(pos != s.end())
        {
            if(*pos >='0' && *pos <='9')
            {
                ans = 10*ans+ (*pos -'0');
                ans = (flag == 0? min(ans, (long)INT_MAX) : min(ans, -(long)INT_MIN));
            }
            else break;
            pos ++;
        }
        return flag == 0?ans:-ans;
    }
};

