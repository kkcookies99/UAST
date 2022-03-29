 class Solution {
public:
    const static int ct=50005;
    int d[ct];
    int XXX(string s) {
        map<char,int> mp;
        mp.clear();
        int n=s.size();
        if(s=="")return 0;
        for(int i=n-1;i>=0;--i){
            d[i]=1;mp.clear();mp.insert(make_pair(s[i],i));
            for(int j=i+1;j<n;++j){
                if(mp.find(s[j])==mp.end()){
                    mp.insert(make_pair(s[j],j));
                    d[j]=d[j-1]+1;
                }
                else {d[j]=d[j-1]-d[mp[s[j]]]+1;break;}
            }
        }
        int res=0;
        for(int i=0;i<n;++i){res=max(res,d[i]);}
        return res;
    }
};

