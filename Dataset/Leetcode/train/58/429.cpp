class Solution {
public:
    int XXX(string s) {
        int n=s.size();
        
        int res=0;
        for(int i=n-1;i>=0;i--)
        {
            if(s[i]!=' ')res++;
            if(s[i]==' ' && res>0)break;
        }
        return res;
    }
};

