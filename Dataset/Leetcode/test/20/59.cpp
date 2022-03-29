 class Solution {
public:
    bool XXX(string s) {
        stack<char> stack;

        for(int i = 0; i < s.size(); i++){
            switch(s[i]){
                case '(' :
                    stack.push(')');
                    break;
                case '[' :
                    stack.push(']');
                    break;
                case '{' :
                    stack.push('}');
                    break;
                default:
                    if(stack.size() == 0 || s[i] != stack.top())
                        return false;
                    stack.pop();
            }
        }

        if(stack.size() == 0)
            return true;
        else
            return false;
    }
};

