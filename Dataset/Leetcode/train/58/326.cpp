 class Solution {
public:
    int XXX(string s) {
        int i;
        for(i=s.size()-1;i>=0;--i){
            if(s[i]!=' ') break;
        }
        int j=i;
        for(i;i>=0;--i){
            if(s[i]==' ') break;
        }
        return j-i;
    }
};

