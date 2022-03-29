 class Solution {
public:
    int XXX(string s) {
        int len = s.length(), i = 0;
        int neg = 1;
        while(s[i] == ' ') i++;
        if(s[i] == '-'){
            neg = -1;
            i++;
        }
        else if(s[i] == '+') i++;
        else if(s[i] > 57 || s[i] < 48)return 0;
        int ans = 0, cur;
        while(i<len && s[i]>=48 && s[i]<=57){
            cur = neg * (s[i] - '0');
            if(neg == 1 && ans > (INT_MAX - cur)/10) return INT_MAX;
            if(neg == -1 && ans < (INT_MIN - cur)/10) return INT_MIN;
            ans = (ans * 10) + cur;
            i++;
        }
        return ans;
    }
};

