 class Solution {
public:
    const string openBrackets = "({[";
    const string closedBrackets = ")}]";
    bool XXX(string s) {
        stack<char> parenthesesStack;
        for(char c : s) {
            size_t closedidx = closedBrackets.find(c);
            if(closedidx == string::npos){
                parenthesesStack.push(c);
            }
            else {
                if(parenthesesStack.empty())    return false;
                char curchar = parenthesesStack.top();
                size_t openidx = openBrackets.find(curchar);
                if(closedidx == openidx){
                    parenthesesStack.pop();
                }
                else return false;
            }
        }
        return parenthesesStack.empty();
    }
};

