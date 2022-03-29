 class Solution {
public:
    int XXX(string s) {
        map<char,int>mp;
        int cur_left_bound=0;
        int maxlen=0;
        for(int i=0;i<s.size();i++){
            cur_left_bound=max(cur_left_bound,mp[s[i]]);
            mp[s[i]]=i+1;
            maxlen=max(maxlen,i-cur_left_bound+1);
        }
        return maxlen;
    }
};

