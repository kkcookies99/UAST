 class Solution {
public:
    int XXX(string s) {
        long long  ans = 0;
        int sign = 1;
        bool spaceflag =true;
        bool signflag =true;
        bool numflag = true;
        for(int i = 0;i <s.size();i++){
            if(s[i]==' '&&spaceflag&&numflag){
                continue;
            }
            if(s[i]=='-'&&signflag&&numflag){
                sign = -1;
                spaceflag =false;
                signflag =false;
                continue;
            }
            if(s[i]=='+'&&signflag&&numflag){
                sign = 1;
                spaceflag =false;
                signflag=false;
                continue;
            }
            if(s[i] >= '0' && s[i] <= '9'){
                ans = (s[i] -'0') +ans * 10; 
                ans = sign ==1? min(ans, (long long)INT_MAX) : min(ans, -(long long)INT_MIN);
                spaceflag =false;
                numflag =false;
                continue;
            }
            if(s[i] == '.'){
                break;
            }
            if(s[i]){
                break;
            }
        }
        return sign * ans;
    }
};



