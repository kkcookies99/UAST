 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ret = nums[0];
        for(int i=1; i<nums.size(); i++){
            ret = ret ^ nums[i];
        }
        return ret;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


