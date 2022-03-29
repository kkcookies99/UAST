 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<int> vec = {1};
        vector<vector<int>> res;
        while (numRows-- > 0)
        {
            res.push_back(vec);
            for (int i = vec.size() - 1; i >= 1; i--)
                vec[i] += (i - 1 >= 0 ? vec[i - 1] : 0);
            vec.push_back(1);
        }
        return res;
    }
};

