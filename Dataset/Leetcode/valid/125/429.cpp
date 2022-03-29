 class Solution {
public:
    bool XXX(string s) {
        string str="";
        for(auto i:s){
            if(isalnum(i)){
                i=tolower(i);
                str+=i;
            }
        }
        string str1(str);
        reverse(str.begin(),str.end());
        if(str1==str) return true;
        else {
              return false;
        }

    }
};

