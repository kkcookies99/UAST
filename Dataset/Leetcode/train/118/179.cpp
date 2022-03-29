 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        if(numRows==1)return {{1}};
        vector<vector<int>> res = {{1}};
        int left,right,n;
        vector<int> tmp;
        while(--numRows)
        {
            left = -1;
            right = 0;
            tmp = *(res.end()-1);
            n = tmp.size();
            vector<int> vec;
            while(right<=n)
            {
                vec.push_back((left>=0?tmp[left]:0)+(right<n?tmp[right]:0));
                ++left;
                ++right;
            }
            res.push_back(vec);
        }
        return res;
    }
};

