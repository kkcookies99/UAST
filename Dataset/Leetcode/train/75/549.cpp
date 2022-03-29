 class Solution {
public:
    void XXX(vector<int>& nums) {
        int i=0,j=nums.size()-1,k=0;
        if(j<0)
            return ;
        while(i<j && k<=j){
            if(nums[k]==1)
                k++;
            else if(nums[k]==0){
                int t=nums[i];
                nums[i]=nums[k];
                nums[k]=t;
                if(k==i)
                    k++;
                i++;
            }else {
                int t=nums[j];
                nums[j]=nums[k];
                nums[k]=t;
                if(j==k)
                    k++;
                j--;
            }
        }
    }
};

