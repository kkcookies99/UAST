class Solution {
public:
    int XXX(string s) {
        int len=0;
        for(int i=s.size()-1;i>=0;i--){
            if(s[i]!=' ')
                len++;
            if(s[i]==' '&&len!=0)
                break;
        }
        return len;
    }
};

