 class Solution {
public:
    int fun(int l,int r,vector<int>& nums,int&target){
        if(l==r)
            return l;
        if(nums[(l+r)/2]>target)
            return fun(l,(l+r)/2,nums,target);
        else if(nums[(l+r)/2]==target)
            return (l+r)/2;
        else    
            return fun((l+r)/2+1,r,nums,target);
    }
    int XXX(vector<int>& nums, int target) {
        return fun(0,nums.size(),nums,target);
    }
};

