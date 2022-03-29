 class Solution {
public:
    string XXX(string a, string b) {
        if (a.size() < b.size())
            a = string(b.size() - a.size(), '0') + a;
        else
            b = string(a.size() - b.size(), '0') + b;
        string res = "";
        int temp = 0, val = 0; //temp表示进位，val表示当前位
        for (int i = a.size() - 1; i >= 0; i--) {
            int na = a[i] - '0';
            int nb = b[i] - '0';
            val = (na + nb + temp) % 2;
            temp = (na + nb + temp) / 2;
            res = to_string(val) + res;
        }
        if (temp == 1)
            return "1" + res;
        else
            return res;
    }
};