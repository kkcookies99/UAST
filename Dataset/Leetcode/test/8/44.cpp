class Solution {
public:
    int XXX(string str) {
        int res = 0;
        bool flag = true, start = false;
        for(int i = 0; i < str.size(); i++)
        {
            if(start == false)
            {
                if(str[i] == '-') 
                {
                    flag = false;
                    start = true;
                }
                else if(str[i] == '+') start = true;
                else if(str[i] >= '0' && str[i] <= '9')
                {
                    start = true;
                    i--;
                }
                else if(str[i] == ' ') continue;
                else return 0;
            }
            else
            {
                if(str[i] >= '0' && str[i] <= '9')
                {
                    start = true;
                    int pop = str[i] - '0';
                    if(res > INT_MAX / 10 || (res == INT_MAX/10 && pop > 7))
                    {
                        if(flag) return INT_MAX;
                        else return INT_MIN;
                    }
                    res = res * 10 + pop;
                }
                else break;
            }
        }
        if(flag) return res;
        else return 0 - res;
    }
};

