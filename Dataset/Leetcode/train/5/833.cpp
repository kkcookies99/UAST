 class Solution {
public:
    string XXX(string s) {
        string tmp;
        tmp=s[0];
        int l=0,r=0;

        for(int i=0;i<s.size()-1;i++){
            if(s[i]!=s[i+1]){
                l=r=i;
            }
            else if(s[i]==s[i+1]){
                l=i;
                r=i+1;
            }
            else if(i>0&&i+1<s.size()&&s[i-1]==s[i+1]){
                l=i-1;
                r=i+1;
            }
            while(l>0&&s[l]==s[l-1]){
                l=l-1;
            }
            while(r<s.size()-1&&s[r]==s[r+1]){
                r=r+1;
            }
            while(l-1>=0&&r+1<s.size()&&s[l-1]==s[r+1])
            {
                l=l-1;
                r=r+1;
            }
            if(tmp.size()<r-l+1){
                tmp.assign(s.begin()+l,s.begin()+r+1);
            }
        }
        return tmp;     
    }
};

