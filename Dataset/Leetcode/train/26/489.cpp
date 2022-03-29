 class Solution {
public:
    int XXX(vector<int>& nums) {
     
     int left=0;
     int right=1;
     int size=nums.size();
     if(nums.empty())return NULL;
    while(right<size&&left<size){
       if(nums[left]==nums[right]){
           right++; 
       }
       else {
           nums[++left]=nums[right++];
       }
      }
       return ++left;
    }
};

