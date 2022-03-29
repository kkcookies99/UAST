 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> ans; 
        for(int i = 0;i < nums.size();i ++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int first = i + 1,end = nums.size() - 1;
            int target = -nums[i];
            for(first = i + 1,end = nums.size() - 1; first < end;){
                if(first > i + 1 && nums[first] == nums[first - 1]){
                    first++;
                    continue;
                }
                if(end < nums.size() - 1 && nums[end] == nums[end + 1]){
                    end --;
                    continue;
                }
                if(nums[first] + nums[end] == target){
                    ans.push_back({nums[first],nums[end],nums[i]});
                }
                if(nums[first] + nums[end] > target){
                    end --;
                }else{
                    first ++;
                }
            }
        }
        return ans;
    }
};

