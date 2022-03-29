 class Solution {
public:
    int XXX(string s) {

        int pos=0,sign=1;

        while(s[pos]==' ')pos++;
        if(pos==s.length())return 0;

        if(s[pos]=='-')sign=-1,pos++;
        else if(s[pos]=='+')pos++;

        long long res=0;
        while('0'<=s[pos]&&s[pos]<='9'&&pos<s.length()){//不等式不能用连等
            res=res*10+s[pos]-'0';
            pos++;
            if(res>INT_MAX&&sign>0)return INT_MAX;
            if(res*sign<INT_MIN)return INT_MIN;
        }

        return res*sign;
    }
};

