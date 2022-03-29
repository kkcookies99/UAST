 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size() < 3) return {};
        vector<vector<int> > ans;
        sort(nums.begin(), nums.end());
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] > 0) return ans;
            if(i > 0 && nums[i] == nums[i-1])   continue;
            int left = i+1, right = nums.size()-1;
            while(left < right){
                if(nums[left] + nums[right] < -nums[i]) left++;
                else if(nums[left] + nums[right] > -nums[i])    right--;
                else{
                    ans.push_back({nums[i], nums[left++], nums[right--]});
                    while(left < right && nums[left] == nums[left-1])  left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                }
                }
        }
        return ans;
    }
};

