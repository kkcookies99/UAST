 class Solution {
public:
    bool XXX(string s) {

        string str;
        for(int i = 0; i < s.size(); i++){
            if((tolower(s[i]) >= 'a' && tolower(s[i]) <= 'z') || (s[i] >= '0' && s[i] <= '9')){
                str += tolower(s[i]);
            }
        }
        int left = 0, right = str.size() - 1;
        while(left <= right){
            if(str[left] != str[right]){
                return false;
            }
            left++,right--;
        }
        return true;
    }
};

