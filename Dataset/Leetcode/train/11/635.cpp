 class Solution {
public:
    int XXX(vector<int>& height) {
        vector<pair<int,int>> v;
        for (int i = 0; i < height.size(); ++i) {
            v.push_back(make_pair(height[i],i));
        }
        sort(v.begin(),v.end(),greater<pair<int,int>>());
        int mi=v[0].second,ma=v[0].second;
        int ans=0;
        for (int j = 1; j < v.size(); ++j) {
            ans=max(ans,v[j].first*(ma-v[j].second));
            ans=max(ans,v[j].first*(v[j].second-mi));
            ma=max(ma,v[j].second);
            mi=min(mi,v[j].second);
        }
        return ans;
    }
};

