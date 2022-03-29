 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        if(nums.size() < 3) return result;
        sort(nums.begin(), nums.end());
        int l = 0, r = nums.size()-1;
        for(int i = 0; i < nums.size()-2; i++){
            if(nums[i] > 0) return result;
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            find(nums, i, nums.size()-1, result);
        }
        return result;
    }

    void find(vector<int>& nums, int cur, int r, vector<vector<int>>& result){
        int l = cur + 1;
        while(l < r){
            int x = (nums[l] + nums[r] + nums[cur]);
            if(x == 0){
                vector<int> curResult {nums[cur], nums[l], nums[r]};
                result.push_back(curResult);
                while(l < r && nums[l] == nums[l+1]) {l++;}
                while(l < r && nums[r] == nums[r-1]) {r--;}
                l++;
                r--;
            }else if(x < 0){
                l++;
            }else{
                r--;
            }
        }

    }
};

