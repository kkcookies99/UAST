 class Solution {
public:
    bool XXX(string s) {
        std::stack<char> word;
        for(int i=0;i<s.size();++i){
            switch(s[i]){
                case '(':word.push('(');break;
                case '[':word.push('[');break;
                case '{':word.push('{');break;
                case ')':if(word.empty()||word.top()!='('){return false;};word.pop();break;
                case ']':if(word.empty()||word.top()!='['){return false;};word.pop();break;
                case '}':if(word.empty()||word.top()!='{'){return false;};word.pop();break;
            }
        }
        if(!word.empty()){
            return false;
        }
        return true;
    }
};

