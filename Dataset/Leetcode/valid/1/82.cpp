 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        map<int, int> pos;
        for (int i = 0; i < nums.size(); ++i)
        {
            if (pos.count(target - nums[i])) 
                return vector<int>{pos[target - nums[i]], i};
            pos[nums[i]] = i;
        }
        return vector<int>();
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


