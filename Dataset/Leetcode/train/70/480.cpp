class Solution {
public:
    int XXX(int n) {
        int s[46]={};
        s[0]=1;
        s[1]=1;
        for(int i=2;i<=n;i++)
        {
            s[i]=s[i-1]+s[i-2];
        }
        return s[n];
    }
};

