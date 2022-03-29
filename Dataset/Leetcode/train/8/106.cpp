class Solution {
public:
    int XXX(string s) {
        char flag = 1,f_sign = 1,f_space = 1;
        long long sum = 0;
        for(int i = 0;i < s.size();i++)
        {   
            if(s.at(i) == ' ' && f_space) continue;
            if(s.at(i) == '-' && f_sign) {flag = 0;f_sign = 0;f_space = 0;continue;}
            if(s.at(i) == '+' && f_sign) {flag = 1;f_sign = 0;f_space = 0;continue;}
            if(s.at(i) >= '0' && s.at(i) <= '9')
                {sum = sum * 10 + s.at(i) - '0';f_sign = 0;f_space = 0;}
            else
                break;
            if(sum > INT_MAX)
                return flag ? INT_MAX : INT_MIN; 
        }
        return flag ? sum : -sum;
    }
};

