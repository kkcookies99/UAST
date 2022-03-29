 class Solution {
public:
    int XXX(vector<int>& nums) {
        int max=nums[0],sum=0;

        for(int i=0;i<nums.size();++i){
            sum+=nums[i];

            if(sum>0){
                if(max<sum){
                    max=sum;
                }
            }else{
                if(nums[i]>max){
                    max=nums[i];
                }
                sum=0;
            }
        }
        return max;
    }
};

