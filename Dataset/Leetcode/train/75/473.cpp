 class Solution {
public:
    void XXX(vector<int>& nums) {
        int len = nums.size();
        int i=0,m=0,n=len-1;
        while(i<=n){
            if(nums[i]==0){
                swap(nums[i],nums[m++]);    
            }
            if(nums[i]==2){
                swap(nums[i],nums[n--]);  
            }
            else i++;
        }   
    }
};

