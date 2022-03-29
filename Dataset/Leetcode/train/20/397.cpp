 class Solution {
public:
    bool XXX(string s) {
        stack<char> s1;
        for(int i = 0;i < s.length(); i++)
        {
            if(s[i] == '(' || s[i] == '[' || s[i] == '{')
                s1.push(s[i]);
            else
            {
                if(s1.top() == '(' && s[i] == ')')
                    s1.pop();
                else if(s1.top() == '[' && s[i] == ']')
                    s1.pop();
                else if(s1.top() == '{' && s[i] == '}')
                    s1.pop();
                else
                    return false;
            }
        }
        return s1.empty();
    }
};```
