 class Solution {
public:
    bool XXX(string s) {
        stack<char> z;

        for (size_t i = 0; i < s.size(); ++i) {
            if (!z.empty() && (z.top() + 1 == s[i] || z.top() + 2 == s[i]))
                z.pop();
            else
                z.push(s[i]);
        }

        return z.empty();
    }
};

