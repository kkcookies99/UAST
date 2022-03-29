 class Solution {
public:
    bool XXX(string s) {
        if(s.empty()) return false;
        if(s[0] == ')' || s[0] == '}' || s[0] == ']' ) return false;
        stack<char> sta;
        for(int i=0; i<s.size(); i++) {
            if(s[i]=='(' || s[i]=='{' || s[i]=='[') {
                sta.push(s[i]);
            } else {
                if(sta.empty()) return false;
                if(sta.top() == '(' && s[i]==')' || sta.top() == '{' && s[i]=='}' 
                || sta.top() == '[' && s[i]==']') {
                    sta.pop();
                } else {
                    return false;
                }
            }
        }
        return sta.empty()? true : false;
    }
};

