 class Solution {
public:
    bool XXX(string s) {
        stack <char> stk;
        unordered_map <char, char> hash_map={
            {')', '('}, {'}', '{'}, {']', '['}
        };
        
        for (int i=0;i<s.length();++i){
            if(stk.empty()){
                stk.push(s[i]);
                continue;
            }   
            auto it = hash_map.find(s[i]);
            if(it != hash_map.end() && stk.top() == it->second){
                stk.pop();
            }
            else{
                stk.push(s[i]);
            }
        }
        return stk.empty();
    }
};

