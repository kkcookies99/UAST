class Solution {
public:
    int XXX(string s) {
        long long res = 0;
        string sign = "";
        bool flag = true;
        for(int i = 0; i < s.size(); i++)
        {   
            if(s[i] == ' ')
            {   if(flag == false)
                    break;
                continue;
            }

            if(s[i] == '+' || s[i] == '-')
            {
                if(flag == false)
                    break;
                sign += s[i];
                flag = false;
                continue;
            }
            
            if(s[i] >= '0' && s[i] <= '9')
            {
                if(res > INT_MAX)
                    return sign[0] == '-' ? INT_MIN : INT_MAX;
                flag = false;
                res = res * 10 + s[i] - '0';
                
                
            }

            if(s[i] < '0' || s[i] > '9')
            {
                break;
            }
                
        }

        res = sign[0] == '-' ? res * -1 : res;

        if(res > INT_MAX)
            return INT_MAX;
        if(res < INT_MIN)
            return INT_MIN;

        return res;


    }
};

