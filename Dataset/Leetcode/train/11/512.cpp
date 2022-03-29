 class Solution {
public:
    int XXX(vector<int>& height) {
        int n = height.size();
        vector<pair<int, int>> p(n);

        for (int i = 0; i < n; ++i) {
            p[i] = {height[i], i};
        }

        sort(p.begin(), p.end());

        int ans = 0, max_i = p[n - 1].second, min_i = p[n - 1].second;

        for (int i = n - 2; i >= 0; --i) {
            ans = max(ans, p[i].first * max(abs(p[i].second - min_i), abs(p[i].second - max_i)));
            max_i = max(max_i, p[i].second);
            min_i = min(min_i, p[i].second);
        }

        return ans;
    }
};

