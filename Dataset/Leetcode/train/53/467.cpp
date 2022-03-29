 class Solution {
public:
    int XXX(vector<int>& nums) {
        int len=nums.size();
        if(len==1){
            return nums[0];
        }
        int max=nums[0];
        int sum=max;
        for(int i=1;i<len;i++){
            if(sum<0 && nums[i]>sum){
                sum=nums[i];
                if(sum>max){
                    max=sum;
                }
            }
            else{
                sum+=nums[i];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
};

