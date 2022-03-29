 class Solution {
public:
    bool XXX(vector<int>& nums) {
    int nsize = nums.size();
    if (nsize==1){
        return true;
    }
    if (nsize==0|nums[0]==0){
        return false;
    }
    int curr = nums[0];
    for(int i=1;i<nsize-1;i++){
    curr--;
    curr = max(nums[i],curr);
    if(curr==0){
        return false;
    }
    }
    return true ;
    }
};

