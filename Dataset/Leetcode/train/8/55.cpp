class Solution {
public:
    int XXX(string s) {
        long long res=0,flag=0,flag2=0;
        while(s[0]==' ') s.erase(0,1);
        if(s[0]=='+') flag2=1,s.erase(0,1);
        if(s[0]=='-'&&flag2==0) flag=1,s.erase(0,1);
        for(char ch:s){
            if(ch>='0'&&ch<='9') res=res*10+ch-'0';
            else break;
            if(res>INT_MAX) return flag==1?INT_MIN:INT_MAX;
        }
        return flag==1?-res:res;
    }
};

