 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int n = nums.size();
        int l, r, sum;
        sort(nums.begin(), nums.end());
        vector<vector<int>> ans;
        for(int i = 0; i< n-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue; // 如果第一个数重复取则跳过
            l = i+1;
            r = n-1;
            while(l < r){
                sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    ans.push_back({nums[i], nums[l], nums[r]});
                    while(l<r && nums[r-1] == nums[r]) r--;
                    while(l<r && nums[l+1] == nums[l]) l++;
                    r--;
                    l++;
                }
                else if(sum > 0){
                    while(l<r && nums[r-1] == nums[r]) r--;
                    r--;
                }
                else{
                    while(l<r && nums[l+1] == nums[l]) l++;
                    l++;
                }
            }
        }
        return ans;
    }
};

