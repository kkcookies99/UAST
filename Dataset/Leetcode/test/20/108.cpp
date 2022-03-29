 class Solution {
public:
    bool XXX(string s) {
        stack<char>stk;
        for(int i=0;i<s.size();i++){
            if(s[i]=='('||s[i]=='['||s[i]=='{'){
                stk.push(s[i]);
                continue;
            }
            else{
                if((stk.empty())||(s[i]==')'&&stk.top()!='(')||(s[i]=='}'&&stk.top()!='{')||(s[i]==']'&&stk.top()!='['))return false;
            }
            stk.pop();
        }
        return stk.empty();
    }
};

