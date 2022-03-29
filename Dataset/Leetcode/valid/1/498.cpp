 class Solution {
public:
    vector<int> XXX(vector<int>& a, int t) {
        unordered_map<int, int> cnt;
        for(int i = 0; i < a.size(); ++i){
            if(cnt.count(t - a[i])) return {cnt[t - a[i]], i};
            else cnt[a[i]] = i;
        }
        return {-1, -1};
    }
};

