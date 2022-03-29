 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map <int,int> ans;
        for (int i = 0; i < nums.size(); i++ ) {
            int res = target - nums[i];
            if (ans.count(res))
                return vector<int> ({ans[res],i});
            else 
                ans[nums[i]] = i;
        }
        return vector<int> ({});
    }
};


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


