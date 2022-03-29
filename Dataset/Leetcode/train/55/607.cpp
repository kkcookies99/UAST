 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n = nums.size(), furthest = 0;
        for(int i = 0; i < n; ++i){
            if(i <= furthest) furthest = max(furthest, i+nums[i]);
            else break;
        }
        return furthest >= n-1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


