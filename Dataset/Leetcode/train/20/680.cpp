 class Solution {
public:
    bool XXX(string s) {
        stack<char> stk;
        for(int i = 0; i < s.size(); i++){
            if(s[i] == '(' || s[i] == '[' || s[i] == '{')
                stk.push(s[i]);
            else{
                if(stk.empty())
                    return false;
                char top = stk.top();
                if((s[i] == ')' && top == '(') || (s[i] == ']' && top == '[') || (s[i] == '}' && top == '{'))
                    stk.pop();
                else
                    return false;
            }
            if(i == s.size() - 1 && !stk.empty())
                    return false;
        }
        return true;
    }
};

