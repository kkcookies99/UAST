 class Solution {
public:
    bool XXX(string s) {
        bool ret = true;
        stack<char> str;
        for(int i=0;i<s.length();i++){
            if(s[i]=='('||s[i]=='['||s[i]=='{'){
                str.push(s[i]);
            }else{
                if(str.empty()){
                    return false;
                }
                if((s[i]-str.top()==1)||(s[i]-str.top()==2)){
                    str.pop();
                }else{
                    return false;
                }
            }
        }

        if(str.empty()){
            return true;
        }else{
            return false;
        }
    }
};
code block

