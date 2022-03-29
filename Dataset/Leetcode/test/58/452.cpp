class Solution {
public:
    int XXX(string s) {
        int ret=0,len=s.length();
        for(int i=len-1;i>=0;i--){
            if(s[i]==' '&&ret!=0) return ret;
            else if(s[i]!=' ') ret++;
        }
        return ret;
    }
};

