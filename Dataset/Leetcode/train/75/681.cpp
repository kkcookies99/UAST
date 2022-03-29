 class Solution {
public:
    void swapx(int &a, int &b){
        int t = a;
        a = b;
        b = t;
    }
    void XXX(vector<int>& nums) {
        int i = 0, j = 0, k = nums.size()-1;
        int key = 1;
        while(i <= k){
            if(nums[i] < key)swapx(nums[i++], nums[j++]);
            else if(nums[i] > key)swapx(nums[i], nums[k--]);
            else i++;
        }
    }
};