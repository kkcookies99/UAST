 class Solution {
public:
    bool XXX(string s) {
        int n = s.size();
        vector<char> ops;
        for(int i=0;i<n;++i){
            char ch =s[i];
            if(ch == '(' || ch == '[' || ch == '{'){
                ops.emplace_back(s[i]);
            }
            else{
                if(ops.size() == 0){
                    return false;
                }
                if(ch == ')'){
                    if(ops.back() == '('){
                        ops.pop_back();
                    }
                    else{
                        return false;
                    }
                }
                else if(ch == '}'){
                    if(ops.back() == '{'){
                        ops.pop_back();
                    }
                    else{
                        return false;
                    }
                }
                else if(ch == ']'){
                    if(ops.back() == '['){
                        ops.pop_back();
                    }
                    else{
                        return false;
                    }
                }
            } 
        }
        if(ops.size() == 0){
            return true;
        }
        return false;
    }
};

