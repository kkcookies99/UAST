 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int result = nums[0];
        int i;
        int size = nums.size();
        for(i = 1;i < size; ++i)
            result = result ^ nums[i];
        return result;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


