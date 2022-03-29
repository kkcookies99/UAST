 class Solution {
public:
    bool XXX(string s) {
        stack<char> stk;
        int len = s.length();
        if(len%2 != 0)return false;
        int i = 0;
        while(i < len){
            if(s[i]=='(' || s[i]=='{' || s[i]=='['){
                stk.push(s[i]);
                i++;
            }else{
                if(s[i]==')'){
                    if(stk.empty()) return false;
                    if(stk.top()!='(') return false;
                    stk.pop();
                }else if(s[i]==']'){
                    if(stk.empty()) return false;
                    if(stk.top()!='[') return false;
                    stk.pop();
                }else if(s[i]=='}'){
                    if(stk.empty()) return false;
                    if(stk.top()!='{') return false;
                    stk.pop();
                }
                i++;         
            }
        }
        return stk.empty();
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

