 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int i,j;
        int len=nums.size();
        for(i=0,j=0;i<len;i++,j++){
            while(nums[i]==val){
                i++;
                if(i==len)return j;
            }
            nums[j]=nums[i];
        }
        return j;
    }
};

