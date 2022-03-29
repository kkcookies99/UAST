 class Solution {
public:
    bool XXX(string s) {
        unordered_map<char,char> has = {{'(',')'},{'{','}'},{'[',']'}};
        stack<char> help;
        for(char ch : s){
            if(help.empty()){
                help.push(ch);
                continue;
            }
            char cur = help.top();
            if(has[cur] != ch)
                help.push(ch);
            else
                help.pop();                         
        }

        return help.empty();
    }
};

