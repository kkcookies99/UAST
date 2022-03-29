 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int> > res;
        sort(nums.begin(),nums.end());
        int n = nums.size();
        for(int i = 0;i < n;i++){
            if(i && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1,k = n - 1;j < k;j++)
            {
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                while(j < k - 1 && nums[i] + nums[j] + nums[k - 1] >= 0) k--;
                if(nums[i] + nums[j] + nums[k] == 0){
                    res.push_back({nums[i],nums[j],nums[k]});
                }
            }
        }
        return res;
    }
};


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


