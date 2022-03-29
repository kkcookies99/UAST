 class Solution {
public:
    bool XXX(string s) {
        stack<char> stk;
        int i=0;
        int n=s.size();
        for(;i<n;i++){
            if(s[i]=='('||s[i]=='{'||s[i]=='['){
                stk.push(s[i]);
            }else if(s[i]==')'){
                if(stk.size()==0){
                    return false;
                }
                char n=stk.top();
                stk.pop();
                if(n!='('){
                    return false;
                }
            }else if(s[i]==']'){
                if(stk.size()==0){
                    return false;
                }
                char n=stk.top();
                stk.pop();
                if(n!='['){
                    return false;
                }
            }else if(s[i]=='}'){
                if(stk.size()==0){
                    return false;
                }
                char n=stk.top();
                stk.pop();
                if(n!='{'){
                    return false;
                }
            }
        }
        if(stk.size()==0){
            return true;
        }
        return false;

        

    }
};

