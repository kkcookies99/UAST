class Solution {
public:
    int XXX(string s) {
        if (s.empty()) return 0;
        string ans;
        for (int i = 0; i < s.size(); i++)
        {
            if (!isspace(s[i]))
            {
                ans = s.substr(i, s.size() - i + 1);
                break;
            }
        }
        if (ans.empty()) ans = s;
        int n = ans.size();
        long res = 0;
        bool over = false;
        bool flag = false;
        if (ans[0] != '+' && ans[0] != '-' && !isdigit(ans[0])) return 0;
        else {

            int i;
            if (ans[0] == '+' || ans[0] == '-') {
                {
                    if (!isdigit(ans[1])) return 0;
                }
                i = 1; flag = true;
            }
            else i = 0;
            int j = i + 1;
            while (j < n)
            {
                if (!isdigit(ans[j])) { j--; break; }
                if (j == n - 1) break;
                j++;
            }
            if (j > n - 1) j = n - 1;

            while (i <= j)
            {
                int pre = res;
                res = res * 10 + (ans[i] - 48);
                if (pre!=0&&res / 10 != pre) {
                    if (flag == false || (flag == true && ans[0] == '+')) res = INT_MAX;
                    if (flag == true && ans[0] == '-') res = INT_MIN;
                    over == true;
                    break;
                }
                i++;
            }
            if (over == false && flag == true && ans[0] == '-')  res = -res;
        }
        return res;

    }
};

