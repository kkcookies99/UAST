 class Solution {
public:
    bool XXX(string s) {
        stack<char> b;
        for(char c:s){
            if(!b.empty()){
                if(c==')'){
                    if(b.top()=='(') b.pop();
                    else return false;
                }
                else if(c==']'){
                    if(b.top()=='[') b.pop();
                    else return false;
                }
                else if(c=='}'){
                    if(b.top()=='{') b.pop();
                    else return false;
                }
                else b.push(c);
            }
            else b.push(c);
        }
        return b.empty();
    }
};

