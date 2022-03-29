 class Solution {
public:
    bool XXX(string s) {
        if(s.size() == 0) return true;
        string str; str += s[0];
        if(s[0] == '}' || s[0] == ')' || s[0] == ']') return false;
        for(int i = 1; i < s.size(); ++i){
            if(s[i] == '}' || s[i] == ')' || s[i] == ']'){
                if(s[i] == '}'){
                    if(str[str.size() - 1] != '{') return false;
                }else if(s[i] == ']'){
                    if(str[str.size() - 1] != '[') return false;
                }else
                    if(str[str.size() - 1] != '(') return false;
                str.pop_back();
            }else{
                str += s[i];
            }
        }
        return str.size() == 0 ? true: false;
    }
};
 

