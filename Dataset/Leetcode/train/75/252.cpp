class Solution {
public:
    void quick_sort(vector<int>& nums, int l, int r) {
        if(l>=r) return;
        int i = l-1, j = r+1, x = nums[(l+r)>>1];
        while(i < j) {
            do i++; while(nums[i] < x);
            do j--; while(nums[j] > x);
            if(i < j)  swap(nums[i], nums[j]);
        }
        quick_sort(nums, l, j), quick_sort(nums, j+1,r);
    }
    void XXX(vector<int>& nums) {
        int n = nums.size();
        quick_sort(nums, 0, n-1);
    }
};

