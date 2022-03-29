 class Solution {
public:
    vector<int> XXX(vector<int>& d) {
        string res = "";
        int e = 0;
        for (int i = d.size() - 1; i >= 0; i -- ) {
            if (i == d.size() - 1) e = (d[i] + 1) / 10, res += (d[i] + 1) % 10 + '0';
            else res += (e + d[i]) % 10 + '0', e = (d[i] + e) / 10;
        }     
        if (e) res += e + '0';
        vector<int> ans;
        for (int i = res.size() - 1; i >= 0; i -- ) ans.push_back(res[i] - '0');
        return ans;
    }
};

