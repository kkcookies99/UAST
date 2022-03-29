 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> ans;
        for(auto i=0;i<nums.size();i++)
            for(auto j=i+1;j<nums.size();j++)
                if(nums[i]+nums[j]==target){
                    ans.push_back(i);
                    ans.push_back(j);
                }
        return ans;
        }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


