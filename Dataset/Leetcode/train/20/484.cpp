 class Solution {
public:
    bool XXX(string s) {
        stack<char>str;
        for(int i=0; i< s.length();++i){
            if(s[i]=='(' ||s[i]=='{' ||s[i]=='[')
                str.push(s[i]);
            else{
                if(str.empty())
                     return false;
                char c = str.top();
                if((s[i]==')' && c=='(') || (s[i]=='}' && c=='{') ||(s[i]==']' && c=='['))
                    str.pop();
                else
                    return false;   
            }   
        }
        return str.empty();
    }
};

