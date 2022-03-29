 class Solution {
public:
    string XXX(string a, string b) {
        if(a.size() < b.size()) {
            string temp = b;
            b = a;
            a = temp;
        }
        int n = b.size() - 1;
        string s;
        int add = 0;  // 保存进位
        int num;
        for(int i = a.size() - 1; i >= 0; --i) {
            if(n >= 0) {  // 看有没有到达b的第一个元素
                num = (a[i] - '0') + (b[n--] - '0') + add;
            } else {
                num = (a[i] - '0') + add;
            }
            if(num == 2 || num == 3) {
                add = 1;
                s += (num % 2 + '0');
            } else {
                add = 0;
                s += (num + '0');
            }
        }
        if(add == 1) {
            s += '1';
        }
        reverse(s.begin(), s.end());
        return s;
    }
};

