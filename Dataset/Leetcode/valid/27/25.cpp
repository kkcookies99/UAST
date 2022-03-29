 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int i = 0, j = nums.size()-1, ans=0;


        while(i<=j){
            if (i == j) {
                if (nums[i] == val){
                    ans++;
                }
            }

            else {
                while (nums[i]!=val && i<j) {
                    i++;
                }
                if (nums[i] == val) {
                    ans++;
                }
                

                while (nums[j]==val && i<j) {
                    ans++;
                    j--;
                }
                nums[i] = nums[j];
            }
            
            i++;
            j--;
        }
        return nums.size()-ans;
    }
};

