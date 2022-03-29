 class Solution {
public:
    int XXX(string s) {
        int sign = 1;
        long num = 0;
        // start when handle number and sign
        int start = 0;
        for(auto ch:s) {
            if(!start && ch == ' ') continue;

            if(!start && ch == '-') {
                sign = -1;
                start = 1;
                continue;
            }
            else if(!start && ch == '+') {
                start = 1;
                continue;
            }
            
            if(ch>='0' && ch<='9') {
                num = num*10 + ch-'0';
                start = 1;
            }
            else    
                break;

            if(num*sign > INT_MAX)
                return INT_MAX;
            else if(num*sign < INT_MIN)
                return INT_MIN;
        }
        return num*sign;
    }
};

