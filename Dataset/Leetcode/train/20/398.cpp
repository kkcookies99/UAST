 class Solution {
public:
    bool XXX(string s) {
        stack<char> stk;
        for(int i = 0;i < s.size();i ++)
        {
            if(s[i] == '(')
                stk.push(s[i]);
            if(s[i] == '[')
                stk.push(s[i]);    
            if(s[i] == '{')
                stk.push(s[i]); 
            if(s[i] == ']')
            {
                if(stk.empty())
                    return false;
                char temp = stk.top();
                stk.pop();
                if(char(temp + 2) - s[i] != 0)
                    return false;
            }
            if(s[i] == ')')
            {
                if(stk.empty())
                    return false;
                char temp = stk.top();
                stk.pop();
                if(char(temp + 1) - s[i] != 0)
                    return false;
            }
            if(s[i] == '}')
            {
                if(stk.empty())
                    return false;
                char temp = stk.top();
                stk.pop();
                if(char(temp + 2) - s[i] != 0)
                    return false;
            }
        }
        return stk.empty() ? true: false;
    }
};

