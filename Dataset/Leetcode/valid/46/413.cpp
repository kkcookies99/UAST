 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if (nums.empty()) {
            return ans;
        }
        backTrace(nums, 0);
        return ans;
    }

private:
    void backTrace(vector<int>& nums, int start) {
        if (start == nums.size() - 1) {
            ans.emplace_back(nums);
            return;
        }
        for (int i = start; i < nums.size(); ++i) {
            swap(nums.at(i), nums.at(start));
            backTrace(nums, start + 1);
            swap(nums.at(i), nums.at(start));
        }
    }

private:
    vector<vector<int>> ans;
};```

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


