 class Solution {
public:
    string XXX(string a, string b) {
        int p1 = a.size() - 1, p2 = b.size() - 1;
        int carry = 0;

        string ans;
        while (p1 >= 0 || p2 >= 0 || carry > 0)
        {
            int val1 = p1 >= 0 ? a[p1--] - '0' : 0;
            int val2 = p2 >= 0 ? b[p2--] - '0': 0;

            int val = val1 + val2 + carry;
            carry = val / 2;
            val %= 2;
            ans.push_back('0' + val);
        }

        return this->reverse(ans);
    }
private:
    string & reverse(string & s)
    {
        int l = 0, r = s.size() - 1;
        while (l < r)
        {
            swap(s[l++], s[r--]);
        }

        return s;
    }
};

