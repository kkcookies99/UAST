 class Solution {
public:
    bool XXX(string s) {
        if(s[0] == ']' || s[0] == '}' || s[0] == ')')
            return false;
        stack<char> stk;
        for(int i = 0; i < s.size(); i++)
        {
            if(s[i] == '[' || s[i] == '{' || s[i] == '(')
            {
                stk.push(s[i]);
                continue;
            }
            if(stk.empty())
                return false;
            if(s[i] == '}' && stk.top() == '{')
                stk.pop();
            else if(s[i] == ')' && stk.top() == '(')
                stk.pop();
            else if(s[i] == ']' && stk.top() == '[')
                stk.pop();
            else
                stk.push(s[i]);
        }
        return stk.empty();
    }
};

