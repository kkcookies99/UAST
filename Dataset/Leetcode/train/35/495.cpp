 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        if(nums.empty()) return 0;
        int mid=0;
        int high=nums.size();
        int low=0;
        mid=high/2;
        while(high!=low)
        {
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) {high=mid;mid=(high+low)/2;}
            else {low=mid+1;mid=(high+low)/2;}

        }
        return high;

    }
};
code block

