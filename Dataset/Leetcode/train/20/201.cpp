 class Solution {
public:
    map<char, char > mp;
    bool XXX(string s) {
        if (s.empty()) return true;
        stack<char > stk;
        mp[')'] = '(';
        mp['}'] = '{';
        mp[']'] = '[';
        for (auto& c : s) {
            if (stk.size() && mp[c] == stk.top()) stk.pop();
            else stk.push(c);
        }
        return stk.empty();
    }
};

