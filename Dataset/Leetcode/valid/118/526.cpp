 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        if (numRows == 0) return {};
        if (numRows == 1) return {{1}};
        if (numRows == 2) return {{1}, {1, 1}};
        vector<vector<int>> result = {{1}, {1, 1}};
        
        while (numRows > 2) {
            auto const & prev = result.back();
            vector<int> curr (prev.size() + 1, 1);
            for (int i = 1; i < prev.size(); ++i) {
                curr[i] = (prev[i] + prev[i-1]);
            }
            result.emplace_back(std::move(curr));
            --numRows;
        }
        return result;
    }
};

