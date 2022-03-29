 class Solution {
public:
    bool XXX(int x) {
        if(x<0) return false;
        string s=to_string(x);
        int i=0;
        int j=s.size()-1;
        for(i;i<j;i++,j--){
            if(s[i]!=s[j])
                return false;
        }
        return true;
    }
};

