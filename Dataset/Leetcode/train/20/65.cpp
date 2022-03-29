 class Solution {
public:
    bool XXX(string s) {
        stack<char> stk;
        for(int i = 0; i < s.size(); i++){
            if(s[i] == ' ') continue;
            if(s[i] == '[' || s[i] == '(' || s[i] == '{')
            {
                stk.push(s[i]);
                continue;
            }
            if(stk.size() > 0){
                char top = stk.top();
                if(top == '(' && s[i] == ')') {
                    stk.pop();
                    continue;
                }
                if(top == '[' && s[i] == ']') {
                    stk.pop();
                    continue;
                }
                if(top == '{' && s[i] == '}') {
                    stk.pop();
                    continue;
                }
            }
            return false;
        }
        return stk.size() == 0;
    }
};

