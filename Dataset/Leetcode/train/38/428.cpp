 class Solution {
public:
    string XXX(int n){
        if(n==1)
            return "1";
        string s=XXX(n-1),res="";
        int m=s.length(),i,j;
        for(i=0;i<m;i+=j){
            for(j=0;i+j<m&&s[i+j]==s[i];j++);
            res+=to_string(j)+s[i];
        }
        return res;
    }
};

