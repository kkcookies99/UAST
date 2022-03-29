 class Solution {
public:
    bool XXX(string s) {
        stack<char> stk;
        for (auto ch : s)
        {
            if (ch == '(' || ch == '{' || ch == '[')
            {
                stk.push(ch);
            }
            else if ((ch == ')' && !stk.empty() && stk.top() == '(') ||
                (ch == '}' && !stk.empty() && stk.top() == '{') || 
                (ch == ']' && !stk.empty() && stk.top() == '['))
            {
                stk.pop();
            }
            else
            {
                return false;
            }
        }
        return stk.empty() ? true : false;
    }
};

