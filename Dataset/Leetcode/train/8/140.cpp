class Solution {
public:
    int XXX(string s) {
        bool positive = true;
        bool hasPassNum = false;
        bool over = false;
        int flag = 0;
        long long res = 0;
        for(int i = 0; i < s.size(); i++)
        {
            if (s[i] == ' ')
            {
                if (hasPassNum || flag) break;
                continue;
            }
            if (s[i] == '-' || s[i] == '+')
            {
                if (hasPassNum || flag) break;
                positive = s[i] == '+';
                flag++;
                continue;
            }
            if (!(s[i] >= '0'  && s[i] <= '9')) break;

            hasPassNum = true;
            if (res * (long long)10 != int(res * 10) || res * (long long)10 + (long long)(s[i] - '0') != int(res * 10 + (s[i] - '0')))
            {
                over = true;
                break;
            }
            res = res * 10 + s[i] - '0';
        }
        return positive ? (over ? 2147483647 : res) : (over ? -2147483648 : -res);
    }
};

