class Solution {
public:
    bool XXX(vector<int>& nums) {
        int far = 0;
        int len = nums.size();

        for (int i=0; i<len; i++) {
            if (i > far) 
                return 0;

            if (nums[i]+i > far) {
                far = nums[i] + i;
            }
        }

        return 1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


