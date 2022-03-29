 class Solution {
public:
    int XXX(string str) {
        int i = 0;
        long s = 0;
        if(str[0] == ' '){
            while(str[i] == ' ') i++;
        }
        int sign = 1;
        if(str[i] == '+' || str[i] == '-'){
            sign = str[i] == '+' ? 1: -1;
            i++;
        }
        while(str[i] >= '0' && str[i] <= '9'){
            s *= 10;
            s += str[i] - '0';
            i++;
            if(s > INT_MAX && sign == 1) return INT_MAX;
            if(s > INT_MAX && sign == -1) return INT_MIN;
        }
        
        return s * sign;
    }
};

