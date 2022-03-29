 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size() < 3) return {};
        vector<int> vec;
        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        int left = 0;
        int right = nums.size()-1;
        while(left < right){
            int i = left+1;
            int j = right;
            while(i < j){
                if(nums[left]+nums[i]+nums[j]== 0){
                    vec.push_back(nums[left]);
                    vec.push_back(nums[i]);
                    vec.push_back(nums[j]);
                    ans.push_back(vec);
                    vec.clear();
                    while(i < j && nums[i]==nums[i+1]) i++;//这里遇到重复的，+1跳过
                    i++;
                    while(i < j && nums[j]==nums[j-1]) j--; //这里遇到重复的，-1跳过
                    j--;
                }
                else if(nums[left]+nums[i]+nums[j] < 0){
                    while(i < j && nums[i]==nums[i+1]) i++;
                    i++;
                }
                else{
                    while(i < j && nums[j]==nums[j-1]) j--;
                    j--;
                }
            }
            while(left < right && nums[left]==nums[left+1]) left++;//最后left的位置后面有重复的，跳过
            left++;
            
        }
        return ans;
    }
};

