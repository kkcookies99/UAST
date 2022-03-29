 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        queue<vector<int>> que;
        vector<vector<int>> res;
        que.push({});
        vector<int> temp;
        while(!que.empty())
        {
            for(auto a : nums)
            {
                if(find(que.front().begin(), que.front().end(), a) == que.front().end())
                {
                    temp = que.front();
                    temp.push_back(a);
                    que.push(temp);
                }
            }
            temp = que.front();
            if(temp.size() == nums.size())
                res.push_back(temp);
            que.pop();
        }
        return res;

    }
};

