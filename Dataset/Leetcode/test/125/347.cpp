 class Solution {
public:
    bool XXX(string &s) {
        int len = s.length();
        if(len == 0) return true;
        int left = 0,right = len-1;
        bool is = true;
        while(left <= right){
            
            while(left <= right && !isalnum(s[left])) ++left;
            while(left <= right && !isalnum(s[right])) --right;
            if(left > right) break;
            if(isdigit(s[left])&&isdigit(s[right])&&s[left]==s[right]);
            else if(isalpha(s[left])&&isalpha(s[right])&&(toupper(s[left])==toupper(s[right])));
            else {is = false;break;}
            ++left;
            --right;
        }
        return is;
    }
};

