 class Solution {
public:
    bool XXX(string s) {
        stack<char> stack1;
        for(char c:s){
            if(stack1.empty()){
                stack1.push(c);
            }else if(stack1.top()=='('&&c==')'){
                stack1.pop();
            }else if(stack1.top()=='['&&c==']'){
                stack1.pop();
            }else if(stack1.top()=='{'&&c=='}'){
                stack1.pop();
            }else{
                stack1.push(c);
            }
        }
        return stack1.empty();
    } 
};

