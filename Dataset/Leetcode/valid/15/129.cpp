 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
       vector<vector<int>> res;
        sort(nums.begin(),nums.end());
        if(nums.size()<3) return {};
        int n=nums.size();
        for(int i=0;i<n-2;i++)  //i是最左边元素
        {
         if(i>0&&nums[i]==nums[i-1]) continue;//排序后的数组如果出现相同的元素的话，以最左边的数为下界
        int left=i+1,right=n-1;//后面的两位数
        int temp=-nums[i];
        while(left<right)
        {
            if(nums[left]+nums[right]==temp)
            {
                res.push_back(vector<int>{nums[i],nums[left],nums[right]});
                while(right>left&&nums[right]==nums[right-1]) right--;
                while(right>left&&nums[left]==nums[left+1]) left++;
                right--;
                left++;
            }
            else if(nums[left]+nums[right]<temp) left++;
            else right--;
        }   
        }         
        return res;
        
    }
};

