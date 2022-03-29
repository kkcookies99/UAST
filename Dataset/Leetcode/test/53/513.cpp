 class Solution {
public:
    int XXX(vector<int>& nums) {
        int n=nums.size();
        if(n==1)return nums[0];
        int res=0;
        int max=INT_MIN;
        for(int i=0;i<n;i++){
            int temp=res+nums[i];
            if(temp<=0){
                if(max<nums[i])max=nums[i];
                if(temp<res){
                    if(i+1<n)res=0;
                }else{
                    res=nums[i];
                }
            }else{
                if(max<temp)max=temp;
                res=temp;
            }   
        }
        return max;
    }
};

