class Solution {
public:
    int XXX(string str) {
        long res = 0;
        int state = 0 ; // state == 0 为初始状态 ，1 为正整数状态 ，2为负整数
        for(char i : str)
        {
            if(state == 0 && i == ' ')continue;
            else if(state == 0 && i == '+')state = 1;
            else if(state == 0 && i == '-')state = 2;
            else if(i >= '0' && i <= '9')
            {
                if(state == 0)state = 1;
                int tmp = i - '0';
                res = res*10 + tmp;
                if(res > INT_MAX)break;
            }
            else break;
        }
        if(state == 1 && res > INT_MAX)res = INT_MAX;
        else if(state == 2)
        {
            res = -res;
            if(res < INT_MIN)res = INT_MIN;
        }
        return res;
    }
};

