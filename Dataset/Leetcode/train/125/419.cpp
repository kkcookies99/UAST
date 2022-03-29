 class Solution {
public:
    bool XXX(string s) {
        int i=0,j=s.size()-1;
        while(i<j){
            if(!isalnum(s[i])){
                i++;
                continue;
            }
            if(!isalnum(s[j])){
                j--;
                continue;
            }
            if(!islower(s[i]))
                s[i]=tolower(s[i]);
            if(!islower(s[j]))
                s[j]=tolower(s[j]);   
            if(s[i]!=s[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
};

