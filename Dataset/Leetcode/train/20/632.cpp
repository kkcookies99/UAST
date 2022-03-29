 class Solution {
public:
    bool XXX(string s) {
        stack<char> symbol;
        char temp;
        if(s.empty()) 
            return false;
        for(char c:s){
            if(c=='('||c=='['||c=='{'){
                symbol.push(c);
            }else{
                if(symbol.empty()) 
                    return false;
                temp = symbol.top();
                symbol.pop();
                if((c==')'&&temp!='(') || (c=='}'&&temp!='{') || (c==']'&&temp!='[')){
                    return false;
                }
            }
        }
        
        if(symbol.empty())
            return true;
        else
            return false;
    }
};

