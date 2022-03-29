 class Solution {
public:
    bool XXX(string s) {
        string st="";
        for(auto x:s){
            if(isalnum(x))st+=tolower(x);
        }
        int i=0;
        int j=st.size()-1;
        while(i<j){
            if(st[i]!=st[j])return false;
            i++;
            j--;
        }
        return true;
    }
};

