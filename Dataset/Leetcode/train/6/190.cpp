 class Solution {
public:
    string XXX(string s, int r) {
        if(r<2) return s;
        string s1;
        int topr=r*2-2;
        vector<string> vvc(r);
        int n=0;
        int i=0;
        int m=1;
        int j=0;
        while(n<s.size()){
            vvc[i]+=s[n];
            
            if(n>0&&(i==0||i==r-1)){ 
                m=m*-1;
                j++;
            }
            n++;
            i+=m;
        }
        for(int i=0;i<r;i++)
            s1+=vvc[i];
            return s1;
    }
};

