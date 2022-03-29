class Solution {
public:
    bool XXX(vector<int>& nums) {
        int maxRange = nums[0];
        for(int i = 0; i<=maxRange; i++){
            maxRange = max(maxRange, nums[i] + i);  //最远的下标范围
            if(maxRange >= nums.size() - 1){
                //只要最远下标超过了数组最远下标就返回true
                return true;
            }
        }     
        return false;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


