class Solution {
public:
    bool XXX(vector<int>& nums) {
       int res=0;
       if(nums.size()<=1)return true;
       for(int i=0;i<=res;i++){//细节
          res=max(i+nums[i],res);
          if(res>=nums.size()-1)return true;
       }
       return false;
    }
};

