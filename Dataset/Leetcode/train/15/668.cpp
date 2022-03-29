 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        set<vector<int>> res;
        if (nums.size()<3) return {};
        sort(nums.begin(), nums.end());
        if (nums[0]>0) return {};

        for (int i=0; i<nums.size(); ++i){
            int left=i+1, right=nums.size()-1;
            while (left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if (sum==0){
                    vector<int> v{nums[i], nums[left], nums[right]};
                    res.insert(v);
                    while (left<nums.size()-1 && nums[left]==nums[left+1] && left<right){
                        left++;
                    }
                    while (nums[right]==nums[right-1] && left<right){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum>0){
                    right--;
                } else {
                    left++;
                }
            }
        }
        vector<vector<int>> r;
        for (auto& a:res){
            r.push_back(a);
        }
        return r;
    }
};

