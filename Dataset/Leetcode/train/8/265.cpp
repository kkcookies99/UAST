class Solution {
public:
    int XXX(string str) {
        int st = 0;
        while (str[st] == ' ') ++st;

        if (!(str[st] >= '0' && str[st] <= '9' || str[st] == '-' || str[st] == '+')) return 0;
        
        LL ans = str[st] == '-' || str[st] == '+' ? 0 : str[st] - '0';
        bool flag = str[st] == '-' ? false : true; // + true    - false

        int size = str.size();
        for (int i = st + 1; i < size && str[i] >= '0' && str[i] <= '9'; i++) {
            ans = ans * 10 + (str[i] - '0');
            if (ans > INT_MAX) return flag ? INT_MAX : INT_MIN;
        }

        return flag ? ans : -ans;
    }
};

