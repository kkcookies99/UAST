 class Solution {
public:

    int len = 0;
    vector<vector<int>> res;
    void per(vector<int>& nums,int k)
    {
        if(k==len)
            res.push_back(nums);
        for(int i=k;i<len;i++)
        {
            swap(nums[k],nums[i]);
            per(nums,k+1); 
            swap(nums[k],nums[i]);
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        len = nums.size();
        per(nums,0);
        return res;
    }
};

