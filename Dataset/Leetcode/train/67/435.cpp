class Solution {
public:
    string XXX(string a, string b) 
    {
        if (a == "0")
            return b;
        else if (b == "0")
            return a;

        string output;
        int carry = 0;

        int m = a.size() - 1, n = b.size() - 1;

        while (m >= 0 || n >= 0 || carry)
        {
            auto lhs = m >= 0 ? a[m] - '0' : 0;
            auto rhs = n >= 0 ? b[n] - '0':  0;

            auto sum = lhs + rhs + carry;
            output = to_string((sum % 2)) + output;
            carry = sum / 2;

            --m;
            --n;
        }

        return output;
    }
};

