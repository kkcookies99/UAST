 class Solution {
public:
    int XXX(string s) {
        int id = 0, flag = 1, res = 0;
        while(s[id] == ' ') id++;
        if(s[id] == '-') flag = -1; 
        else if(s[id] == '+' || (s[id] >= '0' && s[id] <= '9')) flag = 1;
        else return 0;
        if (s[id] == '+' || s[id] == '-') id++;
        while(s[id] == '0') id++;
        while(s[id] >= '0' && s[id] <= '9'){
            if(res > (INT_MAX - (s[id]-'0')) / 10) return flag == 1? INT_MAX: INT_MIN;
            res = res * 10 + (s[id] - '0');
            id++;
        }
        return flag*res;
    }
};

