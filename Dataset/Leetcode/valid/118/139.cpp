 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;
        res.push_back({1});
        for(int i=2;i<=numRows;i++){
            vector<int> temp;
            temp.push_back(1);
            vector<int> last = res.back();
            int count = last.size();
            for(int i=1;i<count;i++){
                int value = last[i] + last[i-1];
                temp.push_back(value);
            }
            temp.push_back(1);
            res.push_back(temp);
        }
        return res;
    }
};

