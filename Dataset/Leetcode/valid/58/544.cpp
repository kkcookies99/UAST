class Solution {
public:
    int XXX(string s) {
        int res=0;
        for(int i=s.size()-1;i<s.size();i--){
            if(s[i]!=' ')
                res++;
            else if(s[i]==' '&&res==0)
                continue;
            else
                break;   
        }
        return res;
    }
};

