 class Solution {
public:
    int XXX(vector<int>& nums) {
        int n = (int)nums.size();
        int max_sum = nums[0], tmp = nums[0];
        for(int i=1;i<n;i++){
            tmp = max(tmp+nums[i], nums[i]);
            max_sum = max(max_sum, tmp);
        }
        return max_sum;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


