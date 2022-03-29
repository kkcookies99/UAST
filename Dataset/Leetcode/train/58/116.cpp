 class Solution {
public:
    int XXX(string s) {
        int t=0;
        int ans=0;
        for(int i=0;i<s.size();i++){
            if(s[i]!=' '){
                t++;
            }
            if(s[i]==' '){
                if(t!=0){ans=t;}
                t=0;
            }
        }
        if(t==0){return ans;}
        return t;
    }
};

