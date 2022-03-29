 class Solution {
public:
    bool XXX(string s) {
        stack<char> stk;
        for(int i = 0; i < s.length(); ++i) {
            while(stk.size() && (stk.top() == '(' && s[i] == ')' ||
                  stk.top() == '{' && s[i] == '}' ||
                  stk.top() == '[' && s[i] == ']')) {
                      stk.pop();
                      i++;
            }
            if(i<s.length()) {
                stk.push(s[i]);
            }
        }
        return stk.empty();
    }
};

