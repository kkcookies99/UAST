 class Solution {
public:
    bool XXX(string s) {
        stack<char> ss;
        for(const char&c: s){
            if(c == '(' || c == '{' || c == '[') ss.push(c);
            else{
                if(ss.empty()) return false;
                if(c == ')' && ss.top() == '(') ss.pop();
                else if(c == '}' && ss.top() == '{') ss.pop();
                else if(c == ']' && ss.top() =='[') ss.pop();
                else return false;
            }
        }
        return ss.empty();
    }
};

