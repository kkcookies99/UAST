class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        if(nums.empty())
        {
            vector<int> E;
            result.push_back(E);
            return result;
        }
        else
        {
            vector<int> sub(nums.begin(),nums.end()-1);
            int add_num=*(nums.end()-1);
            vector<vector<int>> last_result=XXX(sub);
            result=last_result;
            for(auto it=last_result.begin();it!=last_result.end();++it)
            {
                (*it).push_back(add_num);
            }
            result.insert(result.end(),last_result.begin(),last_result.end());
            return result;
        }
    }
};

