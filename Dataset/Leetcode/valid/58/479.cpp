class Solution {
public:
    int XXX(string s) {
        int n=s.size(),cnt=0,pre=0;
        for(int i=0;i<n;i++){
            if(s[i]==' '){
                if(cnt!=0) pre=cnt;
                cnt=0;
            }else cnt++;
        }
        return cnt==0?pre:cnt;
    }   
};

