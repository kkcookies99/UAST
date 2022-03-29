 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
       int l = 0, r = nums.size() - 1;
       while(l < r)
       {
       int mid = (l + r) >> 1;
       if(target <= nums[mid]) r = mid;
       else l = mid + 1; 
       }
       if(l == nums.size() - 1 && target > nums[l]) return l + 1;
        return l;
    }
};

