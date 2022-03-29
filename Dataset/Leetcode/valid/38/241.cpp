class Solution {
public:
    string XXX(int n) {
        string tmp[6]={"","1","11","21","1211","111221"};
        if(n<=5) return tmp[n];
        string res="";
        string t=tmp[5];
        for(int i=6;i<=n;i++){
            res="";
            int cnt=1;
            for(int j=1;j<t.size();j++){
                if(t[j]==t[j-1]){
                    cnt++;
                }else{
                    res+=to_string(cnt)+t[j-1];
                    cnt=1;
                }
            }
            res+=to_string(cnt)+t[t.size()-1];
            t=res;
        }
        return res;
    }
};

