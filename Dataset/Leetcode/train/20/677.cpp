 class Solution {
public:
    bool XXX(string s) {
        stack<char> myStack;
        for(int i=0;i<s.size();i++) {
            if(s[i]=='(' || s[i]=='{' || s[i]=='[') myStack.push(s[i]);  // 左括号入栈
            else {  // 遇到右括号需要进行判断
                if(myStack.empty()) return false;  // 没有匹配括号
                else {
                    if(s[i]==')'&&myStack.top()=='(' || s[i]=='}'&&myStack.top()=='{' || s[i]==']'&&myStack.top()=='[') myStack.pop();
                    else return false;
                }
            }
        }
        return myStack.empty();
    }
};

