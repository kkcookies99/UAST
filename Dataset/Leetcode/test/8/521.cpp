 class Solution {
public:
    int XXX(string s) {
        int num = 0;
        int op = 1;
        int n = s.size();
        for (int i = 0; i < n; ++i){
            if (s[i] == ' ') 
                if (i == 0 || s[i - 1] == ' ') continue;
                else break;
            else if (s[i] == '+' || s[i] == '-')
                if (i == 0 || s[i - 1] == ' ') op = s[i] == '+'? 1:-1;
                else break;
            else if (s[i] >= '0' && s[i] <= '9'){
                if (i == 0 || s[i - 1] == ' ' 
                || s[i - 1] == '+' || s[i - 1] == '-') num = obtainNum(i, s, op  );
                break;
            }
            else break;
        }
        return num;
    }
    int obtainNum(int i, string& s, int op){
        int res = 0;
        for (;i < s.size(); ++i){
            if (s[i] < '0' || s[i] > '9') break;
            int n = s[i] - '0';
            if ((INT_MAX - n) / 10 < res || (INT_MIN + n) / 10 > res){
                res = op == 1? INT_MAX : INT_MIN;
                break;
            }else
                res = res * 10 + (s[i] - '0') * op;//字符s[i]需要转化为数字
        }
        return res;
    }
};

