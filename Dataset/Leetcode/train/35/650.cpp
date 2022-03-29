 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
          //有序数组的查找，考虑二分
          int l=0;
          int r=nums.size()-1;
          while(l<=r)  
          {
              int mid=(r-l)/2+l;
              if(target<nums[mid])
               r=mid-1;
               else if(target>nums[mid])
               l=mid+1;
               else
               return mid;
          }
          return l;
    }
};

