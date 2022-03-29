 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res = {{1}};
        res.reserve(numRows+1);
        for(int i = 1;i<numRows;++i)
        {
            const auto& tmp = res.back();
            vector<int> vec(i+1,1);
            for(int i = 1;i<tmp.size();++i)
            {
                vec[i] = tmp[i]+tmp[i-1];
            }
            res.emplace_back(vec);
        }
        return res;
    }
};

