class Solution {
public:
    bool XXX(int x) {
        string str = to_string(x);
        if(x < 0){
            return false;
        }
        for(int i = 0,j = str.size()-1;i < str.size();i++,j--){
            if(i != j && str[i] != str[j]){
                return false;
            }
        }
        return true;
        
    }
};

