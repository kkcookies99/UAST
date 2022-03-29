class Solution {
public:
    void XXX(vector<int>& nums) {
        int i=0,j=nums.size()-1;
        int tmp=0;
        while(i<j){
            while(i<j&&j>=0&&nums[j]==2) j--;
            while(i<j&&i<nums.size()&&nums[i]!=2) i++;
            tmp=nums[j];
            nums[j]=nums[i];
            nums[i]=tmp;
        }
        i=0;
        while(i<j){
            while(i<j&&j>=0&&nums[j]==1) j--;
            while(i<j&&nums[i]!=1) i++;
            tmp=nums[j];
            nums[j]=nums[i];
            nums[i]=tmp;
        }
    }
};

