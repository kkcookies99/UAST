class Solution {
public:
    int XXX(string s) {
        int res=0,n=s.length(),i=n-1;
        for(i;s[i]==' ';i--);
        for(i;i>=0&&s[i]!=' ';i--,res++);
        return res;
    }
};

