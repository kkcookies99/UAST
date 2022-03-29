 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) 
    {
        vector<vector<int>> res; 
        sort(nums.begin(), nums.end()); 

        for(int k = nums.size() - 1; k >= 2 && nums[k] >= 0; --k)
        {
            while(k < nums.size() - 1 && nums[k] == nums[k + 1]) --k;
            int i = 0, j = k - 1;

            while(i < j) 
            {
                while(j > i && j < k - 1 && nums[j] == nums[j + 1]) --j; 
                while(j > i && nums[i] + nums[j] > -nums[k]) --j;
                while(j > i && nums[i] + nums[j] < -nums[k]) ++i;
                if(i < j && nums[i] + nums[j] == -nums[k])  res.push_back({nums[i++], nums[j--], nums[k]});
            }
        }
        return res; 
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


