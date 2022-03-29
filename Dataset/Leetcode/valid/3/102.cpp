 class Solution {
public:
    int XXX(string s) {
        int w=0,n=s.length(),res=0;
        map<char,bool>mp;
        for(int i=0;i<n;i++,res=max(res,w))
            if(mp.find(s[i])==mp.end()||!mp[s[i]]){
                mp[s[i]]=true;
                w++;
            }
            else
                while(s[i-w]!=s[i])
                    mp[s[i-w--]]=false;                  
        return res;
    }
};

