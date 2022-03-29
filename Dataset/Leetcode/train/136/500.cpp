 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int first = nums[0];
        for(int i=1; i<nums.size();i++)
        {
            first = first ^ nums[i];
        }
        return first;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


