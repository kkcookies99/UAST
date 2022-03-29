 class Solution {
public:
    bool XXX(string s) {
        if(s.length()%2!=0) return false;
        int l=s.length()/2;
        while(l>0){
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
            l--;
        }
        return s.isEmpty();
    }
};

