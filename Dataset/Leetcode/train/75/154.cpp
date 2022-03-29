class Solution {
public:
    void XXX(vector<int>& nums) {
        int n=nums.size();
        int p0=-1,p2=n,i=0;
        //三路快排
        while(i<p2){
            if(nums[i]==0){
                swap(nums[++p0],nums[i++]);
            }
            else if(nums[i]==1){
                ++i;
            }
            else{
                swap(nums[--p2],nums[i]);
            }
        }
    }
};

