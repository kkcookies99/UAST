 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> subset(1);
        for(size_t i=0;i<nums.size();i++) 
        {
            int len = subset.size();
            for(size_t j=0;j<len;j++)   
            {      
                vector<int> tmp = subset[j];      
                tmp.push_back(nums[i]);           
                subset.push_back(tmp);    
            } 
        } 
        return subset;
    }
};

