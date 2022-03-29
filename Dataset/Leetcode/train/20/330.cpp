 class Solution {
public:
    bool XXX(string s) {
        if(s.length()==1){
            return false;
        }
        if(!s.empty()){
            std::stack<char> stack;
            stack.push(s.at(0));
            for(size_t i=1;i<s.length();i++){
                if(!stack.empty()){
                    switch (s.at(i)) {
                    case ')':
                        if(stack.top()=='('){
                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                    case ']':
                        if(stack.top()=='['){
                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                    case '}':
                        if(stack.top()=='{'){
                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                    default:
                        stack.push(s.at(i));
                        break;
                    }
                } else {
                    stack.push(s.at(i));
                }
            }
            return stack.empty();
        } else {
            return true;
        }
    }
};

