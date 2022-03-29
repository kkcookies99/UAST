 class Solution {
public:
    bool XXX(string s) {
        int n=s.size();
        int i=0,j=n-1;
        while(i<j){
            while(i<j && !isalnum(s[i])) i++;
            while(i<j && !isalnum(s[j])) j--;
            if(toupper(s[i])!=toupper(s[j])) return false;
            i++;
            j--;
        }
        return true;
    }
};

