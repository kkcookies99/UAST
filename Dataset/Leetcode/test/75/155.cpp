class Solution {
public:
    void XXX(vector<int>& nums) {
        int zero = 0, one = 0;
        for (int i = 0; i < nums.size(); i++) {
            int tmp = nums[i];
            nums[i] = 2;
            if (tmp < 2) nums[one++] = 1;
            if (tmp < 1) nums[zero++] = 0;
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


