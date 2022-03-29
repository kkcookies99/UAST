 class Solution {
public:
    bool XXX(string s) {
        stack<char> char_stack;
        for(auto ch:s){
            if(ch == '(' || ch == '{' || ch =='['){
                char_stack.push(ch);
            }
            else if(ch == ')'){
                if(char_stack.top()!='(') return false;
                char_stack.pop();
            }
            else if(ch == '}'){
                if(char_stack.top()!='{') return false;
                char_stack.pop();
            }
            else if(ch == ']'){
                if(char_stack.top()!='[') return false;
                char_stack.pop();
            }
        }

        if(char_stack.empty()) return true;
        else return false;
    }
};

