 class Solution {
public:
    int XXX(vector<int>& nums) {
        int n = nums.size();
        if (n == 1) return nums[0];
        int sum = nums[0], max = nums[0];
        for (int i = 1; i < n; ++i)
        {
            if (sum < 0 && nums[i] > sum) sum = nums[i];
            else sum += nums[i];
            max = sum > max ? sum : max;
        }
        return max;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


