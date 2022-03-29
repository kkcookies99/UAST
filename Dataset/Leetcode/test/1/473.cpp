 vector<int> XXX(vector<int>& nums, int target) {
        vector<int> a(2);
        int i=0,j;
        for(;i<nums.size();i++){
            for(j=i+1;j<nums.size();j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        return a;
    }

