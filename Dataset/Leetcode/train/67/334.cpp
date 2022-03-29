 class Solution {
public:
    string XXX(string a, string b) {
        // 将短的字符串合并至长的字符串上，长的字符串即为结果
        // base 的长度永远最长
        string& base = a.length() > b.length() ? a : b;
        string& sub = a.length() > b.length() ? b : a;

        int carry = 0;
        // base和sub的索引
        int ib = base.length() - 1, is = sub.length() - 1;
        while (is >= 0) {
            carry += base[ib] - '0' + sub[is] - '0';
            base[ib] = carry % 2 + '0';
            carry /= 2;
            --ib, --is;
        }
       // 处理剩余的
        while (ib >= 0 && carry != 0) {
            carry += base[ib] - '0';
            base[ib] = carry % 2 + '0';
            carry /= 2;
            --ib;
        }

        if (carry != 0) {
            base.insert(0, "1");
        }

        return base;
    }
};

