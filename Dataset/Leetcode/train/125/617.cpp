 class Solution {
public:
    bool XXX(string s) {
        if(s.size()==0) return true;
        for(int i=0,j=s.size()-1;i<j;i++,j--){
            while((i<s.size())&&!(isalpha(s[i])||isdigit(s[i]))) i++;
            while((j>=0)&&!(isalpha(s[j])||isdigit(s[j]))) j--;
            if((i<j)&&(tolower(s[i])!=tolower(s[j]))) return false;
        }
        return true;
    }
};

