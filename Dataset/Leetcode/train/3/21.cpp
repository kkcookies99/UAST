 class Solution {
public:
    int XXX(string& s) {
        int m[128];
        for(auto& e:m)e=-1;
        int ans=0;
        for(int i=0,j=0;j<s.size();j++){
            if(m[s[j]]>=i)i=m[s[j]]+1;
            m[s[j]]=j;
            ans=max(ans,j-i+1);
        }
        return ans;
    }
};

