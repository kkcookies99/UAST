 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n=nums.size();
        for(int i=1;i<n;i++){
            bool flag=false;
            for(int j=i-1;j>=0;j--){
                if(nums[j]+j>=i){
                    flag=true;
                    break;
                }
            }
            if(!flag)return false;
        }
        return true;
    }
};

