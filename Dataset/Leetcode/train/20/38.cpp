 class Solution {
public:
    bool XXX(string s) {
    stack<char> Stack ;
    for(char c:s){
    if(c=='(') Stack.push(')');
    else if(c=='{') Stack.push('}');
    else if(c=='[') Stack.push(']');
    else if(Stack.empty()||c!=Stack.top())  return 0;
    else Stack.pop();
    }
    return Stack.empty();
    }
};

