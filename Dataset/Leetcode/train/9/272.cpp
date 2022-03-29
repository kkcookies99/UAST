class Solution {
public:
    bool XXX(int x) {
        if(x < 0){
            return false;
        }else{
            string s1 = to_string(x);
            string s2 = s1;
            reverse(s1.begin(),s1.end());
            if(s1 != s2){
                return false;
            }
        }
        return true;
    }
};

