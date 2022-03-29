 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        if(nums.size() < 3)
            return res;
        sort(nums.begin(), nums.end());
        vector<int> temp(3, INT_MIN);
        for(int i = 0; i < nums.size() - 2; i++){
            int target = 0 - nums[i];
            int left = i + 1, right = nums.size() - 1;
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            while(left < right){
                if(nums[left] + nums[right] > target){
                    right--;
                }
                else if(nums[left] + nums[right] == target){
                    if(temp[0] == nums[i] && (temp[1] == nums[left])){//////////////////////////////////////////////////////
                        right--;
                        continue;
                    }
                    temp[0] = nums[i];
                    temp[1] = nums[left];
                    temp[2] = nums[right];
                    res.push_back(temp);
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return res;
    }
};

