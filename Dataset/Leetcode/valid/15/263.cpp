 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int n = nums.size();
        vector<vector<int>> ans;
        if(n<3){
            return ans;
        }
        int i = 0;
        sort(nums.begin(),nums.end());
        if(nums[0]==0){
            if(nums[1]==0&&nums[2]==0){
                ans.push_back({0,0,0});
                return ans;
            }
            else{
                return ans;
            }
        }
        if(n==3){
            if(nums[0]+nums[1]+nums[2]==0){
                ans.push_back({nums[0],nums[1],nums[2]});
                return ans;
            }
            else{
                return ans;
            }
        }
        while(i < n - 2){
            if(nums[i]>0){
                return ans;
            }
            int left = i + 1,right = n - 1;
            while(left < right){
            if(nums[i] + nums[left] + nums[right] == 0){
                ans.push_back({nums[i],nums[left],nums[right]});
                while(nums[left] == nums[left + 1]&&left<right){
                    left++;
                }
                while(nums[right] == nums[right - 1]&&right>left){
                    right--;
                }
                left++;
                right--;
            }
            else if(nums[i] + nums[left] + nums[right] < 0){
                left++;
            }
            else{
                right--;
            }
            }
            while(nums[i] == nums[i+1]&&i<n-2){
                i++;
            }
            i++;
        }
    return ans;
    }
};

