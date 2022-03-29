 class Solution {
public:
    bool XXX(string s) {
        stack<char> bracket;
        unsigned size=s.size();
        for(int i=0;i<size;i++){
            if(bracket.empty()==true)bracket.push(s[i]);
            else{
                if(bracket.top()=='('&&s[i]==')'||bracket.top()=='['&&s[i]==']'||bracket.top()=='{'&&s[i]=='}')bracket.pop();
                else bracket.push(s[i]);
            }
        }
        return bracket.empty();
    }
};

