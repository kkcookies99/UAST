 class Solution {
public:
    bool XXX(string s) {
        stack<char> help;
        for(char i:s){
            if(i=='('||i=='['||i=='{')help.push(i);
            else if(help.empty())return false;
            else{
                if(i==')'&&help.top()=='(')help.pop();
                else if(i==']'&&help.top()=='[')help.pop();
                else if(i=='}'&&help.top()=='{')help.pop();
                else return false;
            }
        }
        return help.empty()?true:false;
    }
};

