class Solution {
public:
    bool XXX(int x) {
        string str = to_string(x);
        int l = 0;
        int r = str.size() - 1;
        while(l < r){
            if(str[l] != str[r]){
                return false;
            }
            r--;
            l++;
        }
        return true;
    }
};