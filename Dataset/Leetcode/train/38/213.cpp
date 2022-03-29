class Solution {
public:
    string XXX(int n) {
        string res="1";
        if(n==1) return res;
        for(int i=2;i<=n;i++){
            string t;
            int cnt=1;
            for(int j=1;j<res.size();j++){
                if(res[j]==res[j-1]) cnt++;
                else {
                    t+=to_string(cnt);
                    t+=res[j-1];
                    cnt=1;
                }
            }
            t+=to_string(cnt);
            t+=res.back();
            cnt=1;
            res=t;
        }
        return res;
    }
};
