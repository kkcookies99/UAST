 class Solution {
public:
    void help(vector<vector<int>> &ans, vector<int> last,int &numRows){
        if(!numRows) return;
        --numRows;
        int sz = last.size();
        vector<int> temp;
        temp.emplace_back(1);
        for (int i = 0; i < sz-1; ++i){
            int ret = last[i] + last[i+1];
            temp.emplace_back(ret);
        }
        temp.emplace_back(1);
        ans.emplace_back(temp);
        help(ans, temp, numRows);
    }

    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        vector<int> last = {1};
        ans.emplace_back(last);
        if(numRows == 0) return ans;
        --numRows;
        help(ans, last, numRows);
        return ans;
    }
};

