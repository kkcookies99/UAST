 class Solution {
public:
    string XXX(string a, string b) {
        if (a.empty() || b.empty()) {
            return a.empty() ? b : a;
        }
        if (a.size() < b.size()) {
            string temp = a;
            a = b;
            b = temp;
        }
        string str = string(a.size() - b.size(), '0');
        b = str + b;

        string res = "";
        int flag = 0;
        for (int i = a.size() - 1; i >= 0; i--) {
            int sum = (a[i] - '0') ^ (b[i] - '0') ^ flag;
            flag = ((a[i] - '0') && (b[i] - '0')) || ((a[i] - '0') || (b[i] - '0')) && flag;
            res.insert(res.begin(), sum + '0');
        }
        if (flag) {
            res.insert(res.begin(), '1');
        }
        return res;
    }
};

