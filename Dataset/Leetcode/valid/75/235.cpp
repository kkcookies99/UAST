class Solution {
public:
    void XXX(vector<int>& nums) {
        int a0=0,a1=0,a2=0;
        for(auto& num:nums){
            if(num==0)a0++;
            else if(num==1)a1++;
            else a2++;
        }
        for(int i=0;i<a0;i++)nums[i]=0;
        for(int i=a0;i<a0+a1;i++)nums[i]=1;
        for(int i=a0+a1;i<a0+a1+a2;i++)nums[i]=2;
 
    }
};

