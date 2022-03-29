 class Solution {
public:
    int XXX(string s) {
        int res=0;
        map<char,int>mp;
        mp['I']=1,mp['V']=5,mp['X']=10,mp['L']=50,mp['C']=100,mp['D']=500,mp['M']=1000;
        int n=s.length()-1;
        for(int i=0;i<n;i++)
        {
            if(mp[s[i]]<mp[s[i+1]])res+=(-1 * mp[s[i]]);
            else res+=mp[s[i]];
        }
        res+=mp[s[n]];
        return res;
    }
};

