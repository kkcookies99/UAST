 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& v) {
        vector<vector<int>> ans;
        sort(v.begin(), v.end());
        int n = v.size();
        for(int i=0, j=0; i<n; i=j)
        {
            int l = v[i][0], r = v[i][1];
            while(j<n && v[j][0] <= r) r = max(r, v[j++][1]);
            ans.push_back({l, r});
        }

        return ans;
    }
};

