 class Solution {
public:
    string XXX(int n) {
        string s="1";
        for(int i=1;i<n;++i){
            string temp;
            int len=s.size();
            int cnt=1;
            char cur=s[0];
            for(int j=1;j<len;++j){
                if(s[j]==cur){
                    ++cnt;
                }
                else{
                    temp+=to_string(cnt)+cur;
                    cnt=1;
                    cur=s[j];
                }
            }
            temp+=to_string(cnt)+cur;
            s=temp;
        }
        return s;
    }
};

