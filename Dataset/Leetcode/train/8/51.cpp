class Solution {
public:
    int XXX(string s) {
        s.erase(0,s.find_first_not_of(' '));
        int range=INT_MAX/10;
        int flag=1;
        int i=1;
        int res=0;
        if(s[0]=='-')   flag=-1;
        else if(s[0]!='+') i=0;
        for(int j=i;j<s.size();j++)
        {
            if(s[i]>'9'||s[i]<'0') return 0;
            if(j>i && (s[j]>'9'||s[j]<'0')) return flag*res;
            if(res>range||(res==range&&(s[j]-'0'>7))) return flag==1?INT_MAX:INT_MIN;
            res=res*10+(s[j]-'0');
        }
        return flag*res;
    }
};

