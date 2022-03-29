 class Solution {
public:
    bool XXX(string s) {
        int left,right;
        left=0,right=s.length()-1;
        while(left<=right){
            while(left<=right && !isChar(s[left])) left++;
            while(left<=right && !isChar(s[right])) right--;
            if(left>right) return true;
            if(!(s[left]==s[right] || tolower(s[left])==tolower(s[right]))) return false;
            left++;
            right--;
        }
        return true;
    }
    bool isChar(char c){
        if(c-'0'>=0 && c-'0'<=9) return true;
        if(c-'A'>=0 && c-'A'<=25) return true;
        if(c-'a'>=0 && c-'a'<=25) return true;
        return false;
    }
};

