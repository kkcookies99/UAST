 class Solution {
public:
    int XXX(vector<int>& nums) 
    {
        int maxn = nums[0];
        for(short i = 1,sum = nums[0];i < nums.size();i++)
        {
            sum = sum > 0 ? sum + nums[i]:nums[i];
            maxn = maxn > sum ? maxn : sum;
        }
        return maxn;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


