class Solution {
public:
    int XXX(string s) {
        int cnt = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s[i]==' ' && !cnt) continue;
            else if(s[i]==' '&& cnt>0) return cnt;
            if(s[i]!=' ')cnt++;
        }
        return cnt;
    }
};

