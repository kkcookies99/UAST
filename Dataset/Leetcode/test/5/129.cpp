 class Solution {
public:
    string XXX(string &s) {
        int head=0,max=1;
        for(int i=0;i<s.size()-1;i++){
            int j=i-1,k=i+1;
            while(j>-1&&k<s.size()&&s[j]==s[k]){
                 --j;
                 ++k;
            }
            if(max<(--k)-(++j)+1){
                head=j;
                max=k-j+1;
            }
            if(s[i]==s[i+1]){
                j=i-1;
                k=i+2;
                while(j>-1&&k<s.size()&&s[j]==s[k])
                {
                    --j;
                    ++k;
                }
                     if(max<(--k)-(++j)+1){
                         head=j;
                         max=k-j+1;
                  }
            }
        }
        return s.substr(head,max);
    }
};

